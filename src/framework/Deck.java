import java.util.ArrayList;
import java.until.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import card;

public class Deck {
	private ArrayList<Card> cards;
	private int numCards=0;
  
  Hand() {
		//cards = new ArrayList<>();
	}
	
  Hand(File gameFile){
	  Scanner in;
	  try{
	  in=new Scanner(gameFile);
	  int cardNumber;
		  String cardSymbol;
		  while(in.hasNest()){
		  cardNumber=in.nextInt();
		  cardSymbol=in.next();
		  Card c=new Card(cardNumber,cardSymbol);
			  card.add(c);
		  }
	  }
	  catch(FileNotFoundException e){
	  e.printStackTrace();
	  }
  	
  }
	
	/* Getter Methods */
	public Card getCard(int numCard) {
		if(numCard < numCards)
			return cards.get(numCard);
		
		return null;
	}
  
  
  
}
