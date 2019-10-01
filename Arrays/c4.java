import java.util.Random;

public class c4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] diceRolls = new int[30];
        int[] outcomes = new int[16];

        for (int i = 0; i < diceRolls.length; i++) {
            int dice1 = rand.nextInt(6 - 1) + 1;
            int dice2 = rand.nextInt(6 - 1) + 1;
            int dice3 = rand.nextInt(6 - 1) + 1;

            diceRolls[i] = dice1 + dice2 + dice3;

            for (int x = 0; x < outcomes.length; x++) {
                if (diceRolls[i] == x + 3) {
                    outcomes[x]++;
                }
            }
        }

        for (int i = 0; i < outcomes.length; i++) {
            System.out.println((i + 3) + " appears " + outcomes[i] + " times");
        }
    }
}
