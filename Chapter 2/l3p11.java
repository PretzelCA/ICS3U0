import java.util.Scanner;

public class l3p11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = new String[3];

        int bigboiword = 0;
        int morebigboiword = 0;

        for(int i = 0; i < 3; i++) {
            System.out.print("Enter word " + (i + 1) + " > ");
            words[i] = input.nextLine();

            if(words[bigboiword].length() < words[i].length()) {
                bigboiword = i;
            } else if(words[bigboiword].length() == words[i].length()) {
                morebigboiword = i;
            }
        }

        System.out.println(words[bigboiword]);

        if(morebigboiword != 0) {
            System.out.println(words[morebigboiword]);
        }
    }
}
