public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }
    public double perimeter() {
        return 2 * PI * radius;
    }

    public String toString() {
        return "Circle with radius: " + radius + ", area: " + area() + ", perimeter: " + perimeter();
    }

}