package Rummy;

import java.util.ArrayList;

public class Hand{
	private ArrayList<Card> cards=null;
	private int numberOfCards;

	public Hand(ArrayList<Card> cards) {
		super();
		this.cards = cards;
		numberOfCards = cards.size();
	}
	
	public boolean isRummy(){
		return false;
		
	}
	public int numberOfcardsForRummy() {
		for (int i = 0; i < numberOfCards - 1; i += getNextSequence(i)) {
			
		}
		return 0;	
	}
	
	private int getNextSequence(int index) {
		int number_of_cards = 1;
		for(int i = index ; i < numberOfCards - 1; i++) {
			Card current_card = cards.get(i);
			if (current_card.isPrevious(nextCard(i))) {
				number_of_cards++;
			}
		}
		if (number_of_cards > 2) {
			return index;
		}
		return 0;
	}
	
	private Card nextCard(int index) {
		return cards.get(index + 1);
	}
	
}
