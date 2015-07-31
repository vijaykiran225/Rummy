package Rummy;

public class Card implements Comparable<Card> {
	private int value;
	private String rank;
	private String suit;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean equals(Card obj) {
		return (value == obj.value);
	}

	public boolean equivalentOf(Card obj) {
		return (rank == obj.rank);
	}

	public boolean isNext(Card obj) {
		if (suit.equals(obj.suit)) {
			return (this.value - obj.value) == 1;
		}
		return false;
	}

	public boolean isPrevious(Card obj) {
		if (suit.equals(obj.suit)) {
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

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return this.value > o.value ? 1 : (this.value < o.value ? -1 : 0);
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
