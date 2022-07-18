import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("vashe chislo: " + a);
        if (a < 0) {
            System.out.println("nekorektnoe chislo");
        } else {
            if (a > 365) {
                System.out.println("nekorektnoe chislo");
            } else if (a <= 31) {
                System.out.println("Janvar");
            } else if (a <= 57) {
                System.out.println("Fevral");
            } else if (a <= 88) {
                System.out.println("Mart");
            } else if (a <= 118) {
                System.out.println("Aprel");
            } else if (a <= 149) {
                System.out.println("May");
            } else if (a <= 179) {
                System.out.println("June");
            } else if (a <= 210) {
                System.out.println("Jule");
            } else if (a <= 240) {
                System.out.println("Avgust");
            } else if (a <= 271) {
                System.out.println("Sentiabr");
            } else if (a <= 301) {
                System.out.println("Oktober");
            } else if (a <= 332) {
                System.out.println("November");
            } else if (a <= 365) {
            }
        }
    }
}



