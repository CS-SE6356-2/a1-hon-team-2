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
	
	void shuffle() {
		ArrayList<Card> newCards = new ArrayList<>();
		
		Random randomNum = new Random();		// random number generator
		
		for(int i = 0; i < cards.size(); i++) {
			int randomPos = randomNum.nextInt(cards.size());
			Card c = cards.get(randomPos);
			cards.remove(randomPos);
			
			newCards.add(c);
		}
		
		cards = newCards;
	}
	
	ArrayList<Card> getCards() { return cards; }

}