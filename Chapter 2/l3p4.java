import java.util.Scanner;

public class l3p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int friendAmount = 0;

        for(;;) {
            System.out.print("Enter name: ");
            String friendName = input.nextLine();
            if (!friendName.equals("done")) {
                friendAmount++;
            } else {
                break;
            }
        }
        System.out.println("You have " + friendAmount + " friends!");
    }
}
