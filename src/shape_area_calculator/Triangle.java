package shape_area_calculator;

public  class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    void printType() {
        System.out.println("Shape: Triangle");
    }
}
