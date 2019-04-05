import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		
		// Test for Card class
		Result result = JUnitCore.runClasses(TestCard.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Successful Test for <Card>: " + result.wasSuccessful());
		
		
		// Test for Hand class
		
		
		// Test for Deck class

	}
}
