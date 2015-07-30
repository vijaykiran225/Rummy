package Rummy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class MainClass {
	
	private static final int NUMBER_OF_CARDS_IN_DECK = 53;
	public static ArrayList<Card> deal(ArrayList<Card> deck,int numOfCards) {
		Collections.shuffle(deck);
		return (ArrayList<Card>) deck.subList(0, numOfCards);
		
	}
	
	public static void main(String args[]) throws IOException {
		int numOfDecks = 3;
		int numOfCards = 13;
		ArrayList<Card> deck = new ArrayList<>();
		for(int i = 1;i <= NUMBER_OF_CARDS_IN_DECK;i++) {
			for(int j = 0;j < numOfDecks;j++){
				deck.add(new Card(i));
			}
		}
		ArrayList<Card> hand = deal(deck,numOfCards);
	}
	
}
