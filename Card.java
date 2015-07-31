package Rummy;

import java.util.Comparator;

public class Card  {
	private int value;
	private String rank;
	private String suit;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isEquivalent(Card obj) {
		return (this.rank.equals(obj.rank) && (!this.suit.equals(obj.suit)));
	}
	public boolean equals(Card obj) {
		return (value == obj.value);
	}

	public boolean isNext(Card obj) {
		
		if (suit.equals(obj.suit)) {
			if(this.rank.equals("A") && obj.rank.equals("K"))
			{
				return true;
			}
			return (this.value - obj.value) == 1;
		}
		return false;
	}

	public boolean isPrevious(Card obj) {
		if (suit.equals(obj.suit)) {
			if(this.rank.equals("K") && obj.rank.equals("A"))
			{
				return true;
			}
			return (obj.value - this.value) == 1;
		}
		return false;
	}

	public Card(int value) {
		super();
		this.value = value;
		this.rank = findRank(value);
		this.suit = findSuit(value);
	}

	@Override
	public String toString() {

		return "\nCard[" + rank +"-"+suit + "-"+value+"]";

	}

	
	public int diffenceBetween(Card other){
		if(this.suit.equals(other.suit)){
			return this.value-other.value;
		}
		else{
			return -1;
		}
		
	}
	
	public static Comparator<Card> compareValues () {
		// TODO Auto-generated method stub
		Comparator<Card> comparator=new Comparator<Card>() {
			
			@Override
			public int compare(Card o1, Card o2) {
				// TODO Auto-generated method stub
				return o1.value > o2.value ? 1 : (o1.value < o2.value ? -1 : 0);
			}
		};
		
		return comparator;
	}

	public static Comparator<Card> compareRank () {
		// TODO Auto-generated method stub
		Comparator<Card> comparator=new Comparator<Card>() {
			
			@Override
			public int compare(Card o1, Card o2) {
				// TODO Auto-generated method stub
				return o1.rank.compareTo(o2.rank);
			}
		};
		
		return comparator;
	}
	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	private String findRank(int value) {
		if (value == 52) {
			return "joker";
		}
		String[] ranks = {  "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K" };
		int cardsInTheSuit = 13;
		return ranks[value % cardsInTheSuit];
	}

	private String findSuit(int value) {
		if (value == 52) {
			return "joker";
		}
		String[] suits = { "spade", "spade", "spade", "spade", "spade", "spade", "spade", "spade", "spade", "spade",
				"spade", "spade", "spade", "heart", "heart", "heart", "heart", "heart", "heart", "heart", "heart",
				"heart", "heart", "heart", "heart", "heart", "club", "club", "club", "club", "club", "club", "club",
				"club", "club", "club", "club", "club", "club", "diamond", "diamond", "diamond", "diamond", "diamond",
				"diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond", "diamond" };
		return suits[value];
	}


}
