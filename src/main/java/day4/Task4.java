package day4;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ran.nextInt(10000);
        }
        int maxSum = 0;
        int sum;
        int count = 0;
        for (int j = 2; j < numbers.length; j++) {
            sum = numbers[j] + numbers[j-1] + numbers[j-2];
            if (sum >= maxSum) {
                maxSum = sum;
                count = j-2;
            }

        }
        System.out.println(maxSum);
        System.out.println(count);
    }
}
