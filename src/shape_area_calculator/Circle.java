package shape_area_calculator;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void printType() {
        System.out.println("Shape: Circle");
    }
}
