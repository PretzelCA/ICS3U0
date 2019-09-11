import java.util.Scanner;
public class c2p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? >");
        String name = scanner.nextLine();

        System.out.println("What is your age? >");
        int age = scanner.nextInt();

        System.out.println("What is your address? >");
        String address = scanner.nextLine();


        System.out.println(name + ", " + age + " years old. Lives at " + address);
    }
}