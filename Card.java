package Rummy;

public class Card {
	private String value;
	private String suit;
	public String getSuite() {
		return suit;
	}
	public void setSuite(String suite) {
		this.suit = suite;
	}
	public Card(String value, String suite) {
		super();
		this.value = value;
		this.suit = suite;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
