import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        System.out.println();
        for (int i = b; i > 0; i--) {
            for (int j = 0; j < b - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
