import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPile {
	
	@Test
	public void testPile() {
		Pile t1 = new Pile();
		//assertNull(t1.getCards());
		
		// Test addCard function
		Card c = new Card(1, "Hearts");
		assertTrue(t1.addCard(c));
		assertFalse(t1.addCard(null));
		
		
		
		
		
	}
}
