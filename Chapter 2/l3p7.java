import java.util.Random;
import java.util.Scanner;

public class l3p7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("super cool 1:30am multiplication game");

        for(;;) {
            Random rand = new Random();

            int num1 = rand.nextInt((9 - 1)) + 1;
            int num2 = rand.nextInt((6 - 1)) + 1;

            System.out.print("What is " + num1 + " x " + num2 + " ? > ");
            String answer = input.nextLine();

            if(Integer.parseInt(answer) != (num1*num2)) {
                break;
            }
        }

        System.out.println("oops! you must be eliminated");
    }
}
