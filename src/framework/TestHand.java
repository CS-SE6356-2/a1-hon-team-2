import static org.junit.Assert.*;

import org.junit.Test;

public class TestHand {
	@Test
	public void testAdd() {
		Hand h = new Hand();
		Card t = new Card(11, "Diamonds");
		
		int numCards = h.getNumCards();
		
		assertEquals(numCards, 0);
		assertNull(h.getCard(0));
		
		h.addCard(t);
		
		assertEquals(h.getNumCards(), ++numCards);
		assertEquals(h.getCard(0), t);
		
		h.removeCard(t);
		
		assertEquals(h.getNumCards(), --numCards);
	}
}