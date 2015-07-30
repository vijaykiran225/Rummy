package Rummy;

import java.util.ArrayList;

public class Player{
	ArrayList<Card> cards=null;

	public Player(ArrayList<Card> cards) {
		super();
		this.cards = cards;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	
}
