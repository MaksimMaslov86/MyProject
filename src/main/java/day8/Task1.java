package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());

        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс: " + (stopTime1 - startTime1));

        long startTime2 = System.currentTimeMillis();
        String str = "0";
        for (int i = 1; i <= 20000; i++) {
            str = str + " " + i;
        }
        System.out.println(str);
        long stopTime2 = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime2 - startTime2));
    }
}
