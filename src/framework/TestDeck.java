import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.File;

import org.junit.Test;

public class TestDeck {
	@Test
	public void testAdd() {

		// Check default constructor
		Deck d = new Deck();

		assertEquals(d.getNumCards(), 0);
		assertNull(d.getCard(0));
		
		// Check addCards function
		d.addCards(new File("testDeck.txt"));
		
		assertEquals(d.getNumCards(), 3);
		assertEquals(d.getCard(0), new Card(1, "Hearts")); // uses overridden .equals to make sure 1st card is correct
		assertNull(d.getCard(4));
		
		// Check parameterized constructor
		Deck d2 = new Deck(new File("testDeck2.txt"));
		
		assertEquals(d2.getNumCards(), 13);
		assertEquals(d2.getCard(12), new Card(13, "Diamonds"));
	}
}
