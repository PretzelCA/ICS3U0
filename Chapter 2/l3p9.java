public class l3p9 {
    public static void main(String[] args) {
        int cashMoney = 1;
        int days = 0;

        do {
            days++;
            cashMoney = cashMoney * 2;
        } while (cashMoney < 100000000);

        System.out.println("It took " + days + " days to get to $1 Million from a single penny");
    }
}
