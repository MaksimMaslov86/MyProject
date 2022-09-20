package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplain plain1 = new Airplain("Boing", 2020, 36.5, 10000);
        Airplain plain2 = new Airplain("Airbus", 2022, 40, 12000);
        Airplain.compareAirplaines(plain1, plain2);
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

    public void setFuel(double fuel) {
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
    public static void compareAirplaines(Airplain pl1, Airplain pl2) {
        if (pl1.length > pl2.length) {
            System.out.println("Самолет " + pl1.manufacturer + " длинее, чем самолет " + pl2.manufacturer);
        } else if (pl1.length < pl2.length){
            System.out.println("Самолет " + pl2.manufacturer + " длинее, чем самолет " + pl1.manufacturer);
        } else {
            System.out.println("Длина самолетов одинаковая");
        }
    }
}