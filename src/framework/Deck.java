import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards;
	private int numCards=0;
  
  Hand() {
		//cards = new ArrayList<>();
	}
	
  Hand(File gameFile){
  	cards=gameFile.split(" ");
	  numCards=caeds.size();
  }
	
	/* Getter Methods */
	public Card getCard(int numCard) {
		if(numCard < numCards)
			return cards.get(numCard);
		
		return null;
	}
  
  
  
}
