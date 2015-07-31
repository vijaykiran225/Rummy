package Rummy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Dealer {
	
	private static final int NUMBER_OF_CARDS_IN_DECK = 53;
	
	
	public static List<Card> deal(List<Card> deck,int numOfCards) {
		Collections.shuffle(deck);
		return  deck.subList(0, numOfCards);
		
	}
	
	public static void main(String args[]) throws IOException {
		int numOfDecks = 3;
		int numOfCards = 13;
		List<Card> deck = new ArrayList<Card>();
		for(int i = 0;i < NUMBER_OF_CARDS_IN_DECK;i++) {
			for(int j = 0;j < numOfDecks;j++){
				deck.add(new Card(i));
			}
		}
		Hand hand=new Hand(deal(deck,numOfCards));
		System.out.println(hand);
		hand.sortHand();
		System.out.println(hand);
	}
	
}
