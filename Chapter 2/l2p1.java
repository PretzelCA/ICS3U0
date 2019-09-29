import java.util.Random;

public class l2p1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int dice1 = rand.nextInt((6 - 1)) + 1;
        int dice2 = rand.nextInt((6 - 1)) + 1;
        int dice3 = rand.nextInt((6 - 1)) + 1;

        if(dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
            System.out.println("two dices are the same");
        } else {
            System.out.println("keep rolling");
        }
    }
}
