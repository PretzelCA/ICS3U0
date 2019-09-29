public class l3p9 {
    public static void main(String[] args) {
        int cashMoney = 1;
        int days = 0;

        for (;;) {
            days++;
            cashMoney = cashMoney * 2;
            if (cashMoney >= 100000000) {
                break;
            }
        }

        System.out.println("It took " + days + " days to get to $1 Million from a single penny");
    }
}
