public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        super("Круг");
        this.r = r;
    }

    public double getArea() {
        return 3.14 * r * r;
    }

    public double getPerimeter() {
        return 2 * 3.14 * r;
    }
}
