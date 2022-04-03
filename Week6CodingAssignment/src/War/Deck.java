package War;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Deck {

	private Card[] deck = new Card[52];
    private int cardDrawn;

    Deck() {

        cardDrawn = 0;

        for (int i = 0; i < deck.length; i++)
            deck[i] = new Card(i);

    }

    public void shuffle() {
        for ( int i = deck.length-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardDrawn = 0;
    }
	public Card draw() {
        Card cardDraw;
        if (cardDrawn < deck.length) {
            cardDraw = deck[cardDrawn];
            cardDrawn++;
        }
        else
            cardDraw = null;

        return cardDraw;
	
    }
}
