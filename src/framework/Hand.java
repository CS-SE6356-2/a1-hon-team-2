import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> cards;
	private int numCards = 0;
	
	Hand() {
		cards = new ArrayList<>();
	}
	
	/* Getter Methods */
	public Card getCard(int numCard) {
		if(numCard < numCards)
			return cards.get(numCard);
		
		return null;
	}
	
	public int getNumCards() {
		return numCards;
	}
	
	/* Utility Methods */
	public void addCard(Card c) {
		cards.add(c);
		numCards++;
	}
	
	public void removeCard(Card c) {
		if(cards.remove(c))
			numCards--;
	}
}