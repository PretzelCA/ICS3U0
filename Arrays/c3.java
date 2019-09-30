import java.util.Random;
import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int highestIQ = 0;

        String[] names = new String[6];
        int[] iq = new int[6];

        for (int i = 0; i < names.length; i++) {
            System.out.print("insert name " + (i + 1) + " here > ");
            names[i] = input.nextLine();
            iq[i] = rand.nextInt((160 - 60)) + 60;
        }

        for (int i = 0; i < names.length; i++) {
            if(iq[i] > iq[highestIQ]) {
                highestIQ = i;
            }
        }

        System.out.println(names[highestIQ] + " has the highest IQ with an IQ of " + iq[highestIQ]);
    }
}
