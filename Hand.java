package Rummy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Hand{
	private List<Card> cards=null;
	private int numberOfCards;

	public Hand(List<Card> list) {
		super();
		this.cards = list;
		numberOfCards = list.size();
	}
	
	@Override
	public String toString() {
		return "Hand \n[cards=" + cards + ", \nnumberOfCards=" + numberOfCards + "]\n\n";
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
	
	public void sortHand()
	{
		Collections.sort(cards);
	}
	
}
