package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Honda");
        car1.setColor("Brown");
        car1.setYear(2021);
        car1.info();
        int difference1 = car1.yearDifference(2025);
        System.out.println(difference1);

        Bike bike1 = new Bike("Kawasaki", "Yellow", 2010);
        bike1.info();
        int difference2 = bike1.yearDifference(2022);
        System.out.println(difference2);
    }
}
class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    void info() {
        System.out.println("Это автомобиль");
    }
    int yearDifference (int inputYear) {
        return Math.abs(year - inputYear);
    }
}
class Bike {
    private String model;
    private String color;
    private int year;

    public Bike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String getColor() {
        return  color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void info() {
        System.out.println("Это мотоцикл");
    }
    int yearDifference (int inputYear) {
        return Math.abs(year - inputYear);
    }
}