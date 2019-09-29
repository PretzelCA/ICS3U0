import java.util.Scanner;

public class l3p3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many mark entries do you have? ");
        int totalMarks = Integer.parseInt(input.nextLine());

        String[] marks = new String[totalMarks];

        for(int i = 0; i < totalMarks; i++) {
            System.out.print("Enter the mark: ");
            String mark = input.nextLine();
            marks[i] = mark;
        }

        double addedMark = 0;

        for(int i = 0; i < totalMarks; i++) {
            addedMark += Integer.parseInt(marks[i]);
        }

        System.out.println("Your average mark is " + (addedMark / totalMarks));
    }
}
