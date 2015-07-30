package Rummy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MainClass {
	
	public ArrayList<Card> deal() {
		return null;
		
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("./src/Rummy/card_deck.txt"));
		String fileContent = "";
		int numOfDecks = 3;
		int numOfCards = 13;
	}
	
}
