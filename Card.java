package Rummy;

public class Card {
	private int number;
	private String suite;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public Card(int number, String suite) {
		super();
		this.number = number;
		this.suite = suite;
	}
}
