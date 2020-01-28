import java.util.ArrayList;

public class c7 {
    public static void main(String[] args) {
        ArrayList<Integer> rnums = new ArrayList<Integer>();

        int numsTotal = 0;
        int i = 0;
        int totalOdds = 0;
        int onetonine[] = new int[9];

        do {
            rnums.add((int)(Math.random()*9+1));
            numsTotal+=rnums.get(i);
            System.out.print(rnums.get(i) + " ");
            i++;
        } while (numsTotal < 100);

        System.out.println("\n");

        for (int j = 0; j < i; j++) {
            onetonine[rnums.get(j)-1]++;
        }

        for (int j = 0; j < 9; j++) {
            System.out.println("Number of " + (j+1) + "s: " + onetonine[j]);
        }
    }
}
