import java.util.Scanner;

public class factorial2911 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What number would you like to compute the factorial for? ");
        int numToComp = input.nextInt();

        int finalNumber = 0;

        for (int i = 0; i < numToComp; i++) {
            if (i != 0) {
                finalNumber = (numToComp * i) + finalNumber;
            }
        }

        System.out.println(finalNumber);
    }
}