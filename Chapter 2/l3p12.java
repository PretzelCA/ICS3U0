import java.util.Scanner;

public class l3p12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("give cool word > ");
        String coolWord = input.nextLine();

        for(int i = 0; i < coolWord.length(); i++) {
            System.out.println(coolWord.substring(i));
        }
    }
}
