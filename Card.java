package Rummy;

public class Card implements Comparable<Card>{
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
	public boolean equivalent(Card obj) {
		return (rank == obj.rank);
	}
	public boolean isNext(Card obj) {
		if(suit.equals(obj.suit)){
			return (this.value - obj.value ) == 1;
		}
		return false;
	}
	public boolean isPrevious(Card obj) {
		if(suit.equals(obj.suit)){
			return (obj.value - this.value ) == 1;
		}
		return false;
	}
	public Card(int value) {
		super();
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Card [value=" + value + ", rank=" + rank + ", suit=" + suit + "]";
	}
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return this.value > o.value ? 1 : (this.value < o.value ? -1 : 0);
	}
}
