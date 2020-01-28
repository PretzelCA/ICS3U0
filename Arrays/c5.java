import java.util.ArrayList;

public class c5 {
    public static void main(String[] args) {
        ArrayList<Integer> rnums = new ArrayList<Integer>();

        int numsTotal = 0;
        int i = 0;
        int totalOdds = 0;

        do {
            rnums.add((int)(Math.random()*10+1));
            numsTotal+=rnums.get(i);
            System.out.println(rnums.get(i));
            i++;
        } while (numsTotal < 100);

        System.out.println("It tooks " + i + " iterations");

        for (int j = 0; j < i; j++) {
            if (rnums.get(j) % 2 == 0) {
                System.out.println(rnums.get(j));
            } else {
                totalOdds++;
            }
        }

        System.out.println("There are " + totalOdds + " odd numbers");
    }
}
