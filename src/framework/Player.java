import java.util.List;

public class Player {
	private String name;
	private Hand hand;
	
	
	public void playCards(List<Card> cardsToPlay, Pile cardPile) {
		for(Card c : cardsToPlay) {
			hand.removeCard(c);
			cardPile.addCard(c);
		}
	}

	public String getName() { return name; }
	public Hand getHand() { return hand; }

	public void setName(String n) { name = n; }
	public void setHand(Hand h) { hand = h; }
}