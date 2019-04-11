import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestPile {
	
	@Test
	public void testPile() {
		Pile t1 = new Pile();
		assertNull(t1.getCards());
		
	}
}
