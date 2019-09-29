import java.util.Random;

public class l3p8 {
    public static void main(String[] args) {
        int rollCount = 0;

        for(;;) {
            rollCount++;
            Random rand = new Random();

            int dice1 = rand.nextInt((6 - 1)) + 1;
            int dice2 = rand.nextInt((6 - 1)) + 1;

            if(dice1 == dice2) {
                System.out.println("Double: | " + dice1 + " | " + dice2 + " | ");
                System.out.println("Took " + rollCount + " rolls.");
                break;
            } else {
                System.out.println("| " + dice1 + " | " + dice2 + " | ");
            }
        }
    }
}
