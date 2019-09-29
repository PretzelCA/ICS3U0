import java.util.Random;
import java.util.Scanner;

public class l2p3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int studentNum = rand.nextInt((999999 - 111111)) + 111111;
        int studentGrade = rand.nextInt((12 - 9)) + 9;
        int cash = rand.nextInt(100);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.println(name + ", Grade " + (studentGrade) + ", Student Number: " + (studentNum) + ", Amount of Cash: $" + (cash));
    }
}
