import java.util.Scanner;

public class c2l1p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Gym, Computer, English, and Math marks. >");
        String[] marks = input.nextLine().split(" ");

        System.out.println("Your average is " + ((Integer.parseInt(marks[0]) + Integer.parseInt(marks[1]) + Integer.parseInt(marks[2]) + Integer.parseInt(marks[3])) / 4));
    }
}
