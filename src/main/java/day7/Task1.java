package day7;

class Airplane {
    public String manufacturer;
    public int year;
    public double length;
    public double weight;
    public double fuel = 0;

    public Airplane(String manufacturer, int year, double length, double weight) {
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

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " +
                length + ", вес " + weight + ", количество топлива в баке: " + fuel +
                " литров");
    }
    public double fillUp(int n) {
        fuel += n;
        return fuel;
    }

    static void compareAirplanes(Airplane p1, Airplane p2) {
        if (p1.length > p2.length) {
            System.out.println("Первый самолет длинее второго на " + (p1.length - p2.length) + " м.");
        } else if (p1.length < p2.length) {
            System.out.println("Второй самолет длинее первого на " + (p2.length - p1.length) + " м.");
        } else {
            System.out.println("Длина самолетов одинаковая");
        }
    }
}

public  class Task1 {

    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2022, 36.5, 15000);
        plane1.setYear(2008);
        plane1.setLength(37);
        plane1.fillUp(135);
        plane1.fillUp(326);
        plane1.info();

        Airplane plane2 = new Airplane("Airbus", 2020, 38,17000);
        plane2.info();
        Airplane.compareAirplanes(plane1, plane2);

    }
}