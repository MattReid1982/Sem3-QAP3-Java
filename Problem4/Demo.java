package Problem4;

public class Demo {
    
    public static void scaleAll(Scalable[] objects, double factor) {

        for (Scalable s : objects) {
            s.scale(factor);
        }
    }
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(4);

        for (Shape s : shapes) {
            System.out.println(s);
        }

        scaleAll(shapes, 2);
        System.out.println("\nAfter scaling:");

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
