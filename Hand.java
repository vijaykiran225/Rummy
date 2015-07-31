package Rummy;

import java.util.List;
import java.util.Collections;

public class Hand {
	private static final String JOKER = "joker";
	private List<Card> cards = null;
	private int numberOfCards;
	private int cardsToCompleteRummy;
	private static int MIN_SET_SIZE = 3;
	private boolean naturalSetPresent;

	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
		numberOfCards = cards.size();
		cardsToCompleteRummy = 13;
		naturalSetPresent = false;
		sortHand();
	}

	@Override
	public String toString() {
		return "Hand [cards=" + cards + ", numberOfCards=" + numberOfCards + ", cardsToRummy=" + cardsToCompleteRummy
				+ "]";
	}

	public boolean isRummy() {
		return this.cardsToCompleteRummy == 0 && this.naturalSetPresent;
	}

	public int numberOfcardsForRummy() {
		int index = 0;
		while (index < numberOfCards - 1) {
			index = getNextSequence(index);
		}
		return this.cardsToCompleteRummy;
	}

	private int getNextSequence(int index) {
		int new_index = getNextNaturalSequence(index);
		int number_of_cards_in_set = (new_index - index) + 1;
		if (number_of_cards_in_set >= MIN_SET_SIZE) {
			this.naturalSetPresent = true;
			meldCards(number_of_cards_in_set);
			return new_index;
		} else {

		}
		new_index = getNextCanasta(index);
		number_of_cards_in_set = (new_index - index) + 1;
		if (number_of_cards_in_set >= MIN_SET_SIZE) {
			meldCards(number_of_cards_in_set);
			return new_index;
		}
		new_index = getNextEquivalentSequence(index);
		number_of_cards_in_set = (new_index - index) + 1;
		if (number_of_cards_in_set >= MIN_SET_SIZE) {
			meldCards(number_of_cards_in_set);
			return new_index;
		}
		Card current_card = cards.get(index);
		if (current_card.getRank() == JOKER) {
			this.cardsToCompleteRummy--;
		}
		return index + 1;
	}

	private int getNextNaturalSequence(int index) {
		Card current_card = cards.get(index);
		Card next_card = nextCard(index);
		if ((next_card != null) && current_card.isPrevious(next_card)) {
			return getNextNaturalSequence(index + 1);
		}
		return index;
	}

	private int getNextCanasta(int index) {
		Card current_card = cards.get(index);
		Card next_card = nextCard(index);
		if ((next_card != null) && current_card.equals(nextCard(index))) {
			return getNextCanasta(index + 1);
		}
		return index;
	}

	private int getNextEquivalentSequence(int index) {
		Card current_card = cards.get(index);
		Card next_card = nextCard(index);
		if ((next_card != null) && current_card.equivalentOf(nextCard(index))) {
			return getNextEquivalentSequence(index + 1);
		}
		return index;
	}

	private void meldCards(int number_of_cards) {
		this.cardsToCompleteRummy -= number_of_cards;
	}

	private Card nextCard(int index) {

		if (index == (numberOfCards - 1)) {

			return null;
		}
		return cards.get(index + 1);
	}

	public void sortHand() {
		Collections.sort(cards);
	}
}
