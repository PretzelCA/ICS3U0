import java.util.Random;

public class l3p5 {
    public static void main(String[] args) {
        for(;;) {
            Random rand = new Random();

            int dice1 = rand.nextInt((6 - 1)) + 1;
            int dice2 = rand.nextInt((6 - 1)) + 1;
            int dice3 = rand.nextInt((6 - 1)) + 1;

            if(dice1 == dice2 && dice2 == dice3) {
                System.out.println("All are same: | " + dice1 + " | " + dice2 + " | " + dice3 + " |");
                break;
            } else {
                System.out.println("| " + dice1 + " | " + dice2 + " | " + dice3 + " |");
            }
        }
    }
}
