package Rummy;

import java.util.List;
import java.util.Collections;

public class Hand{
	private List<Card> cards=null;
	private int numberOfCards;
	private int cardsToRummy;

	public Hand(List<Card> cards) {
		super();
		this.cards = cards;
		numberOfCards = cards.size();
		cardsToRummy = cards.size();
	}
	
	@Override
	public String toString() {
		return "Hand [cards=" + cards + ", numberOfCards=" + numberOfCards + ", cardsToRummy=" + cardsToRummy + "]";
	}

	public boolean isRummy(){
		return this.cardsToRummy == 0;		
	}
	public int numberOfcardsForRummy() {
		for (int i = 0; i < numberOfCards - 1; i += getNextSequence(i)) {
			
		}
		return this.cardsToRummy;	
	}
	
	private int getNextSequence(int index) {
		int number_of_cards_in_set = 1;
		
		for(int i = index ; i < numberOfCards - 1; i++) {
			Card current_card = cards.get(i);
			if (current_card.isPrevious(nextCard(i)) || current_card.equals(nextCard(i)) || current_card.equivalentOf(nextCard(i))) {
				System.out.println(i);
				number_of_cards_in_set++;
			} else {
				i++;
				break;
			}
		}
		if (number_of_cards_in_set > 2) {
			this.cardsToRummy -= number_of_cards_in_set; 
		}
		return number_of_cards_in_set;
	}
	
	private int getNextNaturalSequence(int index) {
		Card current_card = cards.get(index);
		if (current_card.isPrevious(nextCard(index))){
			return getNextNaturalSequence(index);
		}
		return index;
	}
	
	private int getNextCanasta(int index) {
		Card current_card = cards.get(index);
		if (current_card.equals(nextCard(index))){
			return getNextCanasta(index);
		}
		return index;
	}
	
	private int getNextEquivalentSequence(int index) {
		Card current_card = cards.get(index);
		if (current_card.equivalentOf(nextCard(index))){
			return getNextEquivalentSequence(index);
		}
		return index;
	}
	
	private Card nextCard(int index) {
		return cards.get(index + 1);
	}
	
	public void sortHand()
	{
		Collections.sort(cards);
	}
}
