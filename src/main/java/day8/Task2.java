package day8;

class Airplane {
    public String manufacturer;
    public int year;
    public double length;
    public double weight;
    public double fuel = 0;

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
    public String toString() {
        return  "Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " +
                length + ", вес " + weight + ", количество топлива в баке: " + fuel +
                " литров";
    }
}

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane ("Boeing", 2000, 150, 10000);
        System.out.println(airplane);



    }
}
