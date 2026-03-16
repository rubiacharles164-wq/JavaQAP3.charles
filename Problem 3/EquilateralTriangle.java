public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    try {
        @Override
        public double area() {
            double a = getA();
            double b = getB();
            double c = getC();

            // Check triangle inequality
            if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            throw new IllegalArgumentException("Invalid triangle sides: triangle inequality violated.");
            }

            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }catch (IllegalArgumentException e) {
        System.out.println(e.getMessage("Invalid triangle sides: triangle inequality violated."));
        }return 0;
        
    }
    try {
        @Override
        public double perimeter() {
            double a = getA();
            double b = getB();
            double c = getC();

            // Check triangle inequality
            if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
                throw new IllegalArgumentException("Invalid triangle sides: triangle inequality violated.");
            }

            return a + b + c;
        }catch (IllegalArgumentException e) {
        System.out.println(e.getMessage("Invalid triangle sides: triangle inequality violated."));
        }return 0;
    }
}