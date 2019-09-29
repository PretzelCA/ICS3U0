import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] friends = new String[8];
        int bigFriend = 0;

        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter friend " + (i + 1) + "'s name > ");
            friends[i] = input.nextLine();
        }

        for (int i = 0; i < friends.length; i++) {
            if (friends[bigFriend].length() < friends[i].length()) {
                bigFriend = i;
            }
        }

        System.out.println("Longest friend name is " + friends[bigFriend] + " with " + friends[bigFriend].length() + " characters in their name.");
    }
}
