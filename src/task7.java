import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[10];

        Random random = new Random();
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = random.nextInt(1, 100);
            System.out.print(arrayOfInts[i] + " ");
        }
        System.out.println();

        int maxElement = arrayOfInts[0];

        for (int j = 1; j < arrayOfInts.length; j++) {
            if (maxElement < arrayOfInts[j]) {
                maxElement = arrayOfInts[j];
            }
        }

        System.out.println(maxElement);
    }
}