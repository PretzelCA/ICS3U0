import java.util.Random;

public class l2p4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int cardValue = rand.nextInt((13 - 1) + 1);
        int cardSuit = rand.nextInt((4 - 1) + 1);

        String[] cardValueArray = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] cardSuitArray = {"Diamonds", "Spades", "Hearts", "Clubs"};

        System.out.println(cardValueArray[cardValue - 1] + " of " + cardSuitArray[cardSuit - 1]);
    }
}
