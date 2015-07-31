package Rummy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HandTest {

	private List<Card> sampleSpace=new ArrayList<Card>();
	
	@Test
	public void testIsRummy() {
		fail("Not yet implemented");
	}

	private void buildSampleSpace(){
		sampleSpace.add(new Card(33));
		sampleSpace.add(new Card(34));
		sampleSpace.add(new Card(3));
		
		sampleSpace.add(new Card(25));
		sampleSpace.add(new Card(35));
		sampleSpace.add(new Card(0));
		
		sampleSpace.add(new Card(40));
		sampleSpace.add(new Card(9));
		sampleSpace.add(new Card(0));
		
		sampleSpace.add(new Card(48));
		sampleSpace.add(new Card(15));
		sampleSpace.add(new Card(19));
		
		sampleSpace.add(new Card(0));
	}
	@Test
	public void testNumberOfcardsForRummy() {
		buildSampleSpace();
		Hand hand = new Hand(sampleSpace);
		hand.numberOfcardsForRummy();
		
	}

}
