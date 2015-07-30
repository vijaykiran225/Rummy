package Rummy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {
	
	Card sampleCardValue1;
	Card sampleCardValue2;
	
	@Test
	public void testEqualsCard() {
		sampleCardValue1=new Card(5);
		sampleCardValue2=new Card(10);
		
		assertTrue(sampleCardValue1.equals(sampleCardValue2));
		
	}

	@Test
	public void testEquivalent() {
		sampleCardValue1=new Card(5);
		sampleCardValue2=new Card(10);
		
		assertFalse(sampleCardValue1.equivalent(sampleCardValue2));
	}

	@Test
	public void testIsNext() {
		sampleCardValue1=new Card(9);
		sampleCardValue2=new Card(10);
		
		assertTrue(sampleCardValue1.isNext(sampleCardValue2));
	}

	@Test
	public void testIsPrevious() {
		sampleCardValue1=new Card(11);
		sampleCardValue2=new Card(10);
		
		assertFalse(sampleCardValue1.isPrevious(sampleCardValue2));
	}

}
