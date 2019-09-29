import java.util.Random;

public class l2p2 {
    public static void main(String[] args) {
        Random rand = new Random();

        int temperature = rand.nextInt((50 - (-50))) - 50;

        if(temperature < 0) {
            System.out.println("The temperature is below zero");
        } else if (temperature > 0) {
            System.out.println("The temperature is above zero");
        } else {
            System.out.println("The temperature is zero");
        }
    }
}
