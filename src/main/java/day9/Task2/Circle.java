package day9.Task2;

public class Circle extends Figure{
    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double perimeter() {
        return (Math.PI * radius * 2);
    }
}
