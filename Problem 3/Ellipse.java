public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double area() {
        return Math.PI * a * b;
    }
    public double perimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2);
    }

    public String toString() {
        return "Ellipse with semi-major axis: " + a + " and semi-minor axis: " + b + ", area: " + area() + ", perimeter: " + perimeter();
    }
}