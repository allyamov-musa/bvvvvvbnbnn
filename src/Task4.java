import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        double b = scanner1.nextDouble();
        System.out.println();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        ;
    }
}
