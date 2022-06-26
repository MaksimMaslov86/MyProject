package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarModel("Форд");
        car.setColor("желтый");
        car.setYear(2020);

        Bike bike = new Bike("Suzuki", "зеленый", 2021);

        car.info();
        bike.info();

        System.out.println("Марка автомобиля: " + car.getCarModel() + ", цвет: " + car.getColor() +
                ", год выпуска: " + car.getYear());
        System.out.println("Марка автомобиля: " + bike.getBikeModel() + ", цвет: " + bike.getColor() +
                ", год выпуска: " + bike.getYear());

        System.out.println(car.yearDifference(2020));
        System.out.println(bike.yearDifference(2022));
    }
}
