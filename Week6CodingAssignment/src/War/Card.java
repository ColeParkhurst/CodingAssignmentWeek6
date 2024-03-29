package War;

public class Card {

	private int cardNum;
	private int length;
	final static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    final static String[] ranks = {"Ace", "2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King"};

    Card (int theCard) {
        setCardNum (theCard);
    }

    public void setCardNum (int theCard) {
        cardNum = (theCard >= 0 && theCard <= 51)? theCard: 0;
    }

    public int getCardNum() {
        return cardNum;
    }

    public String toString() {
        return ranks[cardNum%13] + " of " + suits[cardNum/13];
    }

    public String getSuit() {
        return suits[cardNum/13];
    }

    public String getRank() {
        return ranks[cardNum%13];
    }

    public int getValue() {
        return cardNum%13;
    }

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	} 
}
	

