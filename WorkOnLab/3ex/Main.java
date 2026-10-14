public class Main {
    public static void main(String[] args) {
        Shape[] list = {
            new Rectangle(4, 5),
            new Square(3),
            new Circle(2.5),
            new Triangle(3, 4, 5),
            new Parallelogram(6, 4, 3)
        };

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName() + ": S = " + list[i].getArea() + ", P = " + list[i].getPerimeter());
        }
    }
}
