// Alcide Viau ICS3U0

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        for (;;) {
            Random rand = new Random();
            Scanner input = new Scanner(System.in);

            int[] phoneNumber = new int[3];
            int giftCard = 0;

            System.out.println("Would you like a Toronto number or a Mississauga number?");
            String city = input.nextLine();

            if (city.toLowerCase().equals("toronto")) {
                phoneNumber[0] = 416;
            } else if (city.toLowerCase().equals("mississauga")) {
                phoneNumber[0] = 905;
            } else {
                System.out.println("Invalid choice!");
                break;
            }

            phoneNumber[1] = rand.nextInt(999 - 111) + 111;
            phoneNumber[2] = rand.nextInt(9999 - 1111) + 1111;

            giftCard = rand.nextInt(125 - 25) + 25;

            System.out.println("Your phone number is " + phoneNumber[0] + "-" + phoneNumber[1] + "-" + phoneNumber[2] + " and you have $" + giftCard + " on your gift card");
            System.out.println("Is this okay?");
            String consent = input.nextLine();

            if (consent.toLowerCase().equals("yes")) {
                System.out.println("Goodbye!");
                break;
            } else if (consent.toLowerCase().equals("no")) {
                System.out.println("Restarting");
            } else {
                System.out.println("Invalid choice!");
                break;
            }
        }
    }
}
