import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TestDeck {
	@Test
	public void testAdd() {

		Deck d = new Deck();


		assertEquals(d.getNumCards(), 0);
		assertNull(d.getCard(0));
		
		d.addCards(new File("testDeck.txt"));
		
		assertEquals(d.getNumCards(), 3);
		assertEquals(d.getCard(0).getNumber(), 1);
		assertEquals(d.getCard(0).getSymbol(), "Hearts");
		assertNull(d.getCard(4));
		
		Deck d2 = new Deck(new File("testDeck2.txt"));
		
		assertEquals(d2.getNumCards(), 13);
		assertEquals(d2.getCard(12).getNumber(), 13);
		assertEquals(d2.getCard(12).getSymbol(), "Diamonds");
	}
}
