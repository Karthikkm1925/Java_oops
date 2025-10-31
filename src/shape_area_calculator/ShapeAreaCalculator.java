package shape_area_calculator;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 8);

        // Demonstrating polymorphism
        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape s : shapes) {
            s.printType();
            System.out.println("Area: " + s.getArea());
            System.out.println("-------------------");
        }
    }
}
