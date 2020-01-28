import java.util.ArrayList;
import java.util.Scanner;

public class quickWrittenExamPrep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMarks[][] = new int[8][20];
        ArrayList<String> friends = new ArrayList<String>();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 20; j++) {
                totalMarks[i][j] = (int) ((Math.random() * (100 - 50)  + 1) + 50);
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.print((i+1) + ": ");
            for (int j = 0; j < 20; j++) {
                System.out.print(totalMarks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        String currentFriendName = "";
        int x = 0;

        System.out.println("Now please enter all of your friend's names :) Type done when you are complete :)");

        do {
            System.out.print("Enter friend " + (x+1) + "'s name > ");
            currentFriendName = input.nextLine();
            friends.add(currentFriendName);
            x++;
        } while (!currentFriendName.equals("done"));

        System.out.println();
        System.out.println("Your friends :)");

        for (int i = 0; i < (friends.size() - 1); i++) {
            System.out.println("Friend " + (i+1) + ": " + friends.get(i) + " :)");
        }
    }
}
