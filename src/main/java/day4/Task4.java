package day4;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] array = new int[100];
        int index = 0;
        int sum3 = 0;
        int maxSum3 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10000);
        }
        for (int j = 0; j < array.length-2; j++) {
            sum3 = array[j] + array[j+1] + array[j+2];
            if (sum3 > maxSum3) {
                maxSum3 = sum3;
                index = j;
            }
            sum3 = 0;
        }
        System.out.println(maxSum3 + ", " + index);

    }
}
