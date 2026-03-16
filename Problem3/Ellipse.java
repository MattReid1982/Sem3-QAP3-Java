package Problem3;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");

        if (axis1 >= axis2) {
            a = axis1;
            b = axis2;
        } else {
            a = axis2;
            b = axis1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(
            2 * (a * a + b * b) - ((a - b) * (a - b)) / 2 
        );
    }
}
