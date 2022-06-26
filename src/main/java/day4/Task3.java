package day4;
import  java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] numbers = new int[12][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = ran.nextInt(50);
            }
        }
        int count = 0;
        int maxSum = 0;
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            sum = 0;
            for (int number : numbers[i]) {
                sum += number;
            }
            if (sum >= maxSum) {
                maxSum = sum;
                count = i;
            }
        }
        System.out.println(count);


    }
}
