import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCard {

	@Test
	public void testAdd() {
		// Check default constructor
		Card t1 = new Card();
		
		assertEquals(t1.getNumber(), 0);
		assertEquals(t1.getSymbol(), "");
		
		// Check parameterized constructor
		Card t2 = new Card(1, "Spades");
		
		assertEquals(t2.getNumber(), 1);
		assertEquals(t2.getSymbol(), "Spades");
		
		// Check setNumber and setSymbol functions
		t1.setNumber(11);
		t1.setSymbol("Clubs");
		
		assertEquals(t1.getNumber(), 11);
		assertEquals(t1.getSymbol(), "Clubs");
		
		// Check overridden .equals() function
		t1.setNumber(1);
		t1.setSymbol("Spades");
		
		assertEquals(t1, t2);
		
	}
	


}
