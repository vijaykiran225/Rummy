package Rummy;

public class Card {
	private int number;
	private String suit;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSuite() {
		return suit;
	}
	public void setSuite(String suite) {
		this.suit = suite;
	}
	public Card(int number, String suite) {
		super();
		this.number = number;
		this.suit = suite;
	}
}
