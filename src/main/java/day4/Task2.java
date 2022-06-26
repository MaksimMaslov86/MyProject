package day4;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ran.nextInt(10000);
        }
        int max = numbers[0];
        int min = numbers[0];
        int countEnd0 = 0;
        int sumEnd0 = 0;

        for(int number : numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
            if (number % 10 == 0) {
                countEnd0++;
                sumEnd0 += number;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, заканчивающихся на 0: " + countEnd0);
        System.out.println("Сумма элементов массива, заканчивающихся на 0: " + sumEnd0);
    }
}
