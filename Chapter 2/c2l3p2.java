import javax.swing.text.InternationalFormatter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class c2l3p2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat currentYear = new SimpleDateFormat("yyyy");

        Scanner input2 = new Scanner(System.in);
        Scanner input =  new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your date of birth? (YYYY-MM-DD)");
        String[] dob = input.nextLine().split("-");

        int currentAge = Integer.parseInt(currentYear.format(currentDate)) - Integer.parseInt(dob[0]);

        int cardNumber = 1;

        System.out.println(name + ", " + currentAge + ", " + dob[1] + " " + dob[2] + " " + dob[0] + ". New credit card number: " + cardNumber );
    }
}
