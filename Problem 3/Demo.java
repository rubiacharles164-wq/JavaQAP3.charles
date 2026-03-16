public static void main(String[] args) {
    
    Circle circle = new Circle(5);
    System.out.println("Circle Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());

    Ellipse ellipse = new Ellipse(4, 2);
    System.out.println("Ellipse Area: " + ellipse.getArea() + ", Perimeter: " + ellipse.getPerimeter());

    Triangle triangle = new Triangle(3, 4, 5);
    System.out.println("Triangle Area: " + triangle.getArea() + ", Perimeter: " + triangle.getPerimeter());

    //Dont know how to test EquilateralTriangle, nor how to do the loop for shape.
}