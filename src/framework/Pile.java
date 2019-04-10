import java.util.ArrayList;
import java.util.Random;

public class Pile {
	private ArrayList<Card> cards;
	
	void addCard(Card c) {
		cards.add(c);
	}
	
	Card drawCard() {
		if(cards.isEmpty()) return null;	// return null if there are no cards in Pile
		
		Random randomNum = new Random();	// random number generator
		int randCardPos = randomNum.nextInt(cards.size()); // pick a number from 0 - (size of pile - 1)
		
		Card ret = cards.get(randCardPos);	// get card from array
		cards.remove(randCardPos);			// remove card from array
		
		
		return ret;		// return that card in array
	}
	
	
	
}