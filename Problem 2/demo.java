public static void main(String[] args) {
    Point point = new Point(3, 4);
    System.out.println("Point: " + point);
    MovablePoint MovablePoint = new MovablePoint(1, 2, 0.5f, 0.5f);
    System.out.println("MovablePoint: " + MovablePoint);
    MovablePoint.move();
}