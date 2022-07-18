import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String newVarible = "New string";
        int newInt = 5;

        Random Random = new Random();
        int amount0Days = Random.nextInt(1, 20);

        System.out.println(amount0Days);
        if (amount0Days < 10) {
            System.out.println("NET");
        } else {
            if (amount0Days >= 19) {
                System.out.println("NET");
            } else {
                System.out.println("DA");
            }
        }

    }
}