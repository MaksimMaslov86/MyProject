package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure f1 = new Circle("Blue", 10);
        Figure f2 = new Rectangle("Black", 5, 8);
        Figure f3 = new Triangle("Red", 2, 5, 6);

        System.out.println(f1.area());
        System.out.println(f1.perimeter());

        System.out.println(f2.area());
        System.out.println(f2.perimeter());

        System.out.println(f3.area());
        System.out.println(f3.perimeter());
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
        public static double calculateRedPerimeter(Figure[] figures) {
            double sumPer = 0;
            for (int i = 0; i < figures.length; i++) {
                if (figures[i].getColor().equals("Red")){
                    sumPer += figures[i].perimeter();
                }
            }
            return sumPer;
        }
        public static double calculateRedArea(Figure[] figures) {
            double sumArea = 0;
            for (int i = 0; i < figures.length; i++) {
                if (figures[i].getColor().equals("Red")) {
                    sumArea += figures[i].area();
                }
            }
            return sumArea;
        }
    }
abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();
}
class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }
    public double area() {
        return Math.PI * (radius * radius);
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Figure {
    private int length, height;

    public Rectangle(String color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }
    public double area() {
        return length * height;
    }
    public double perimeter() {
        return 2 * (length + height);
    }
}
class Triangle extends Figure {
    private int a, b, c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double perimeter() {
        return a + b + c;
    }
}