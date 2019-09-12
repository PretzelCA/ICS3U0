import java.util.Scanner;

public class c2l1p4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Input your 4 digit number pin:");
       int pin = input.nextInt();

       int newPin = (int) Math.round((pin + ( Math.random()) * 100 ));
       while (newPin > 9999) {
           newPin = (int) (newPin - Math.round(Math.random() * 10));
       }

       System.out.println("Your new 4 digit number pin is " + newPin);
    }
}
