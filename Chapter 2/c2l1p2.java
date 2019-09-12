import java.util.Scanner;

public class c2l1p2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? >");
        int age = input.nextInt();

        if ((100 - age) <= 0) {
            System.out.println("You're over 100, this program wouldn't be useful");
        } else {
            System.out.println("You have " + (100 - age) + " years remaining until you turn 100");
        }
    }
}
