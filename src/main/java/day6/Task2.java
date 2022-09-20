package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplain plain1 = new Airplain("Boieng", 2020, 36.5, 10000);
        plain1.setYear(2021);
        plain1.setLength(40);
        plain1.fillUp(10);
        plain1.fillUp(5);
        plain1.info();
    }
}
class Airplain {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuel;
    public Airplain(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setFuel (double fuel) {
        this.fuel = fuel;
    }
    public double getFuel() {
        return fuel;
    }
    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length
                           + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public void fillUp(int n) {
        fuel += n;
    }
}
