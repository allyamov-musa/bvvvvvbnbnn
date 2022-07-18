import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();
        System.out.println();
        System.out.println("vashe vreme: " + a);
            if (a < 00.00) {
                System.out.println("nekorektnoe vreme");
            } else if (a <= 8.29) {
                System.out.println("Podom");
            } else if (a <= 8.59) {
                System.out.println("zariadka");
            } else if (a <= 9.39) {
                System.out.println("zavtrak");
            } else if (a <= 9.59) {
                System.out.println("tyra toiak");
            } else if (a <= 12.59) {
                System.out.println("yroki");
            } else if (a <= 13.59) {
                System.out.println("obed");
            } else if (a <= 15.59) {
                System.out.println("master class");
            } else if (a <= 16.29) {
                System.out.println("poldnik");
            } else if (a <= 18.29) {
                System.out.println("otriad vrema");
            } else if (a <= 19.00) {
                System.out.println("ychin");
            } else if (a <= 19.59) {
                System.out.println("svobodnoe vreme");
            } else if (a <= 22.10) {
                System.out.println("vechernee meropriatie");
            } else if (a <= 22.45) {
                System.out.println("diskoteka");
            } else if (a <= 7.59) {
                System.out.println("otboia");
            }
        }
    }
