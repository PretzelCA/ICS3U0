import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

public class l3p2 {
    public static void main(String[] args) throws ParseException {
        Random rand = new Random();

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY MM dd");

        Scanner input =  new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your date of birth? (YYYY-MM-DD)");
        String[] dob = input.nextLine().split("-");

        Date birthDate = dateFormat.parse(dob[0] + " " + dob[1] + " " + dob[2]);
        int currentAge = Integer.parseInt(dateFormat.format(currentDate)) - Integer.parseInt(dateFormat.format(birthDate));

        int[] cardNumber = {rand.nextInt((9999 - 1111)) + 1111, rand.nextInt((9999 - 1111)) + 1111, rand.nextInt((9999 - 1111)) + 1111, rand.nextInt((9999 - 1111)) + 1111};

        System.out.println(name + ", " + currentAge + ", " + dateFormat.format(birthDate)+ ". New credit card number: " + cardNumber[0] + "-" + cardNumber[1] + "-" + cardNumber[2] + "-" + cardNumber[3]);
    }
}
