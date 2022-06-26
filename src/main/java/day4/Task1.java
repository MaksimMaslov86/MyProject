package day4;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int x = sc.nextInt();
        int[] numbers = new int[x];
        int sum = 0;
        int countEvenNum = 0;
        int countOddNum = 0;
        int countOne = 0;
        int countEight = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ran.nextInt(10) + 1;
        }
        for (int number:numbers) {
            System.out.println(number);
            sum += number;
            if (number > 8) {
                countEight++;
            }
            if (number == 1) {
                countOne++;
            }
            if (number % 2 != 0) {
                countOddNum++;
            }
            if (number % 2 == 0) {
                countEvenNum++;
            }
        }

        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + countEight);
        System.out.println("Количество чисел равных 1: " + countOne);
        System.out.println("Количество четных чисел: " + countEvenNum);
        System.out.println("Количество нечетных числе: " + countOddNum);
        System.out.println("Сумма всех чисел массива: " + sum);
    }
}
