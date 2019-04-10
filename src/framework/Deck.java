import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards;
  
  Hand() {
		cards = new ArrayList<>();
	}
	
  Hand(File gameFile){
  
  }
	
	/* Getter Methods */
	public Card getCard(int numCard) {
		if(numCard < numCards)
			return cards.get(numCard);
		
		return null;
	}
  
  
  
}
