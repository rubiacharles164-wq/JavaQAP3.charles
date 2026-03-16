public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public getName() {
        return "Circle";
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


}