package day3;
import  java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        while (true) {
            if (b == 0) {
                break;
            } else {
                System.out.println(a / b);
            }
            a = sc.nextDouble();
            b = sc.nextDouble();
        }


    }
}
