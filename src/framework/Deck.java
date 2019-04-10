import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Deck {
	private ArrayList<Card> cards;
	private int numCards = 0;

	Deck() {
		cards = new ArrayList<>();
	}

	Deck(File gameFile) {
		cards = new ArrayList<>();
		addCards(gameFile);
	}

	/* Getter Methods */
	public Card getCard(int numCard) {
		if (numCard < numCards)
			return cards.get(numCard);

		return null;
	}
	
	public int getNumCards() {
		return numCards;
	}
	
	public void addCards(File gameFile) {
		Scanner in;
		try {
			in = new Scanner(gameFile);
			int cardNumber;
			String cardSymbol;
			while (in.hasNext()) {
				cardNumber = in.nextInt();
				cardSymbol = in.next();
				Card c = new Card(cardNumber, cardSymbol);
				cards.add(c);
				numCards++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
