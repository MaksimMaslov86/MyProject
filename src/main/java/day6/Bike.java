package day6;

class Bike {
    String bikeModel;
    String color;
    int year;
    public Bike(String bikeModel, String color, int year) {
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

    void info() {
        System.out.println("Это мотоцикл");
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

