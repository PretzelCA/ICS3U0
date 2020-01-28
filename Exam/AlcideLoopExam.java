public class AlcideLoopExam {
    public static void main(String[] args) {
        // Initialize the variables used
        int total = 0;
        int totalFours = 0;
        int totalLoops = 0;
        int currentLoopNumber;

        // Create a do while loop that loops until total is equal to or above 1000
        do {
            // Generate the random number and store it in "currentLoopNumber"
            currentLoopNumber = (int) (Math.random() * (120 - 10) + 1) + 10;
            // Add "currentLoopNumber" to the total
            total+=currentLoopNumber;
            // Print the randomized number
            System.out.print(currentLoopNumber);
            // Check if the randomized number is a multiple of 4
            if (currentLoopNumber % 4 == 0) {
                // Print an asterisk on the same line, add 1 to the totalFours variable, and add a new line if it is
                System.out.print("*\n");
                totalFours++;
            } else {
                // Just add a new line if it isn't
                System.out.print("\n");
            }
            // Increment the totalLoops variable
            totalLoops++;
        } while (total <= 1000);

        // Print all the variables required in a statement
        System.out.println("The total sum was " + total);
        System.out.println("The loop ran " + totalLoops + " times");
        System.out.println("There are " + totalFours + " numbers that are a multiple of four");
    }
}
