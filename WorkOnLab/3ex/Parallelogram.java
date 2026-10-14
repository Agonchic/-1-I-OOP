public class Parallelogram extends Shape {
    private double a;
    private double b;
    private double h;

    public Parallelogram(double a, double b, double h) {
        super("Параллелограмм");
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }

    public double getArea() {
        return a * h;
    }
}
