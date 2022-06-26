package day6;

class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuel = 0;

    Airplane(String manufacturer, int year, double length, double weight) {
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
    public double getFuel(){
        return fuel;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " +
                           length + ", вес " + weight + ", количество топлива в баке: " + fuel +
                           " литров");
    }
    public double fillUp(int n) {
        fuel += n;
        return fuel;
    }

}

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2022, 36.5, 15000);

        plane.setYear(2008);
        plane.setLength(38);
        plane.fillUp(135);
        plane.fillUp(326);
        plane.info();

    }
}
