import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		
		// Test for Card class
		Result resultCard = JUnitCore.runClasses(TestCard.class);
		
		for(Failure failure : resultCard.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Successful Test for class <Card>: " + resultCard.wasSuccessful());
		
		
		// Test for Hand class
		Result resultHand = JUnitCore.runClasses(TestHand.class);
		
		for(Failure failure : resultHand.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Successful Test for class <Hand>: " + resultHand.wasSuccessful());
		
		
		// Test for Deck class
		Result resultDeck = JUnitCore.runClasses(TestDeck.class);
		
		for(Failure failure : resultDeck.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Successful Test for class <Deck>: " + resultHand.wasSuccessful());

		// Test for Pile class
		Result resultPile = JUnitCore.runClasses(TestPile.class);
		
		for(Failure failure : resultPile.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Successful Test for class <Pile>: " + resultPile.wasSuccessful());
		
	}
}
