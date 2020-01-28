import java.io.*;
import java.util.Scanner;

public class q1c7 {
    public static void main(String[] args) {
        int amountOfFriends = 0;

        Scanner input = new Scanner(System.in);

        try {
            FileWriter out = new FileWriter("friends.txt");
            BufferedWriter writeFile = new BufferedWriter(out);

            System.out.print("Enter the amount of friends you have > ");

            amountOfFriends = Integer.parseInt(input.nextLine());

            String friendMarks[][] = new String[amountOfFriends][6];

            for (int i = 0; i < amountOfFriends; i++) {
                System.out.print("Enter friend " + (i+1) + "'s name > ");
                friendMarks[i][0] = input.nextLine();
                writeFile.write(friendMarks[i][0] + " ");
                for (int j = 0; j < 5; j++) {
                    friendMarks[i][j+1] = Integer.toString((int) (Math.random() * (100 - 50) + 1) + 50);
                    writeFile.write(friendMarks[i][j+1] + " ");
                }
                writeFile.write(Integer.toString((Integer.parseInt(friendMarks[i][1]) + Integer.parseInt(friendMarks[i][2]) + Integer.parseInt(friendMarks[i][3]) + Integer.parseInt(friendMarks[i][4]) + Integer.parseInt(friendMarks[i][5])) / 5));
                writeFile.newLine();
            }
            writeFile.close();
            out.close();

        } catch (Throwable e) {
            System.out.println("LOOOOL ERROR");
            System.err.println(e.getMessage());
        }
    }
}
