package War;

import java.util.ArrayList;

public class Player {

	ArrayList<Card> playerCards;
	
	public Player() {
		playerCards = new ArrayList<Card>(52);
	}
	
	public void drawCard(Card cardOne) {
		playerCards.add(cardOne);
	}
	
	public Card playCard() {
		return playerCards.remove(0);
	}
	
	public Card whereCard(int location) {
		return playerCards.get(location);
	}
	
	public int cardTotal() {
		return playerCards.size();
	}
	
	
}
