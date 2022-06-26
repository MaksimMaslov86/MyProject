package day6;
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

    void info() {
        System.out.println("Это автомобиль");
    }
    int yearDifference(int yearInput) {
        int difference = year - yearInput;
        if (difference < 0) {
            return -difference;
        } else {
            return difference;
        }
    }
}

