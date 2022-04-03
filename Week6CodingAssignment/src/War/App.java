package War;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class App {

    public static void main(String[] args) {
    	
         
        Card[][] hands = new Card[2][1];
        Deck myDeck = new Deck();
        myDeck.shuffle();
        
        
        for (int i = 0; i < 26; i++) {
        	
            System.out.printf("\n Round %s of War \n", i);

            
                for (int player = 0; player < hands.length; player++)
                    hands[player][0] = myDeck.draw();

            for (int player = 0; player < hands.length; player++) {
                System.out.printf("Player %d: ", player);
              
                printHand(hands[player]);
            }

            int player1 = hands[0][0].getValue();
            int player2 = hands[1][0].getValue();

            if (player1 > player2)
                System.out.println(" Player One Wins.");
            else if (player2 > player1)
                System.out.println(" Player Two Wins.");
            else
                System.out.println(" Draw.");

        }   
       
    }

    public static void printHand(Card[] hand) {

        for (int card = 0; card < hand.length; card++)
            System.out.printf( "%s, ", hand[card].toString());

}
    
}