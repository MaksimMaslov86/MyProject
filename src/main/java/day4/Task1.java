package day4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int countLager8 = 0;
        int count1 = 0;
        int countEvenNum = 0;
        int countOddNum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(11);
            sum += array[i];
            if (array[i] > 8) {
                countLager8++;
            }
            if (array[i] == 1) {
                count1++;
            }
            if (array[i] % 2 == 0) {
                countEvenNum++;
            } else {
                countOddNum++;
            }
        }
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + countLager8);
        System.out.println("Количество чисел больше 1: " + count1);
        System.out.println("Количество четных чисел: " + countEvenNum);
        System.out.println("Количество нечетных чисел: " + countOddNum);
        System.out.println("Количество четных чисел: " + sum);
    }
}
