public class Task {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[10];

        for (int i = 1; i < arrayOfInts.length; i++) {
            if (i % 2 == 0) {
                arrayOfInts[i] = -1;
            } else {
                arrayOfInts[i] = 1;
            }
        }

        for (int current : arrayOfInts) {
            System.out.println(current);
        }
    }
}
