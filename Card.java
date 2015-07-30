package Rummy;

public class Card {
	private int value;

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean equals(Card obj) {
		return (value == obj.value);
	}
	public boolean isNext(Card obj) {
		return false;
	}
	public boolean isPrevious(Card obj) {
		return false;
	}
}
