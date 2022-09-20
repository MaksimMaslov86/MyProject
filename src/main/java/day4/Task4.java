package day4;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[100];
        int index = 0;
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10000);
        }
        int count = 3;
        int counter = 1;
        for (int j = 0; j < array.length - (count-1); j++) {
            sum += array[j];

            if (counter == count) {
                if (sum > maxSum) {
                    maxSum = sum;
                    index = j - (count-1);
                }
                sum = 0;
                counter = 0;
            }
            counter++;
        }
        System.out.println(maxSum + ", " + index);

    }
}
