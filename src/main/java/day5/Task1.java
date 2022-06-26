package day5;
class Car {
    private String carModel;
    private String color;
    private int year;

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    public String getCarModel() {
        return carModel;
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
}

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarModel("Форд");
        car1.setColor("желтый");
        car1.setYear(2020);
        System.out.println("Марка автомобиля: " + car1.getCarModel() + ", цвет: " + car1.getColor() +
                            ", год выпуска: " + car1.getYear());

    }
}
