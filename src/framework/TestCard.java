import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCard {

	@Test
	public void testAdd() {
		Card t1 = new Card();
		
		assertEquals(t1.getNumber(), 0);
		assertEquals(t1.getSymbol(), "");
		
		Card t2 = new Card(1, "Spades");
		
		assertEquals(t2.getNumber(), 1);
		assertEquals(t2.getSymbol(), "Spades");
		
		t1.setNumber(11);
		t1.setSymbol("Clubs");
		
		assertEquals(t1.getNumber(), 11);
		assertEquals(t1.getSymbol(), "Clubs");
	}
	


}
