import java.util.Scanner;

public class l3p1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] toppings = new String[5];

        System.out.println("There are 3 available toppings:");
        System.out.println("1) cheese, 2) vegetarian, 3) pepperoni");
        System.out.println(" ");

        for(int i = 0; i < 5; i++) {
            System.out.print("Person " + (i + 1) + " please enter your topping: ");
            toppings[i] = input.nextLine();
        }

        System.out.println(" ");

        for(int i = 0; i < 5; i++) {
            System.out.println("Person " + (i + 1) + " would like " + toppings[i]);
        }
    }
}
