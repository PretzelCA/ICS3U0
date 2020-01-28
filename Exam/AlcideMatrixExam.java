import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AlcideMatrixExam {
    public static void main(String[] args) {
        // Initialize the variables, ArrayList, and other objects used
        ArrayList<Integer> even = new ArrayList<Integer>();
        int currentLoopNumber;

        // Crate a do while loop that runs until "even" has 7 entries
        do {
            // Generate the random number and store it in "currentLoopNumber"
            currentLoopNumber = (int) (Math.random() * (100 - 1) + 1) + 1;

            // Checks if "currentLoopNumber" has a remainder of 0 when modulus with 2 is applied
            if (currentLoopNumber % 2 == 0) {
                even.add(currentLoopNumber);
            }
        } while (even.size() != 7);

        // Print out all the numbers from "even" using (i+1) to say "Number 1" instead of "Number 0"
        for (int i = 0; i < even.size(); i++) {
            System.out.println("Number " + (i+1) + " is: " + even.get(i));
        }

        // Creates a try catch
        try {
            // Creates a FileWriter pointing to "lotteryTicketAlcide.txt" and a BufferedWriter using "out"
            FileWriter out = new FileWriter("lotteryTicketAlcide.txt");
            BufferedWriter writeFile = new BufferedWriter(out);

            // Loops through all of even, writing the value to the file with a space after it
            for (int i = 0; i < even.size(); i++) {
                writeFile.write(even.get(i) + " ");
            }

            // Writes 2 newlines
            writeFile.newLine();
            writeFile.newLine();

            // Closes the writeFile and out
            writeFile.close();
            out.close();

            // Informs the user that the ticket has been generated
            System.out.println("Ticket Generated");
        } catch (IOException e) {
            // Handles any IOException error that might occur
            System.err.println(e.getMessage());
        }
    }
}
