import java.util.Scanner;

public class c2p5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input of gallon(s):");
        int gallons = input.nextInt();

        System.out.println("Your total of " + gallons + " gallon(s) equal to " + (gallons * 3.705) + " litres");
    }
}
