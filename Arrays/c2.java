import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] sales = new int[12];
        int totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter month " + (i + 1) + " sales: ");
            sales[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }

        int salesGrowth = (sales[11] / sales[0]);

        System.out.println("This years total sales amount is " + totalSales);
        System.out.println("There was a growth of " + salesGrowth + "% between January and December");
    }
}
