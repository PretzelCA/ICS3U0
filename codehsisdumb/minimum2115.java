import java.util.Scanner;

public class minimum2115 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = input1.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input2.nextInt();

        System.out.print("Enter third number: ");
        int thirdNum = input3.nextInt();

        System.out.println(Math.max(firstNum, Math.max(thirdNum, secondNum)));
    }
}
