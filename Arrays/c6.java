import java.util.ArrayList;

public class c6 {
    public static void main(String[] args) {
        ArrayList<Integer> rnums = new ArrayList<Integer>();

        int totalNum = 0;
        int l = 0;

        do {
            rnums.add((int)(Math.random()*((50) - (-50))+1) + (-50));
            System.out.println(rnums.get(l));
            totalNum+=rnums.get(l);
            l++;
        } while (totalNum > -45);

        System.out.println("Nums backwards:");

        for (int i = l; i > 0; i--) {
            System.out.println(rnums.get(i - 1));
        }

        System.out.println("All numbers with a multiple of 11:");

        for (int i = 0; i > l; i++) {
            if (rnums.get(i) % 11 == 0) {
                System.out.println(rnums.get(i));
            }
        }
    }
}
