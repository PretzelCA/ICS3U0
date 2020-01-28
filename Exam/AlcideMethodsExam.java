import java.util.Scanner;

public class AlcideMethodsExam {
    public static void main(String[] args) {
        // Create a new input scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user for the first number and store it to num1
        System.out.print("Enter number 1 > ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println();

        // Ask the user for the second number number and store it to num2
        System.out.print("Enter number 2 >" );
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println();

        // Call the calculate method and print the answer out
        System.out.println(num1 + " + " + num2 + " is equal to " + calculate(num1, num2));
    }

    static int calculate(int num1, int num2) {
        // Add num1 with num2 and return the answer
        return (num1 + num2);
    }
}
