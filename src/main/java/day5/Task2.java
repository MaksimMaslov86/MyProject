package day5;

class Bike {
    private String bikeModel;
    private String color;
    private int year;
    public Bike (String bikeModel, String color, int year) {
        this.bikeModel = bikeModel;
        this.color = color;
        this.year = year;
    }
    public String getBikeModel() {
        return  bikeModel;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Сузуки", "красный", 2021);
        System.out.println("Марка автомобиля: " + bike1.getBikeModel() + ", цвет: " + bike1.getColor() +
                ", год выпуска: " + bike1.getYear());

    }
}
