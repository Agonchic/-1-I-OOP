public class Main {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);
        System.out.print("a = ");
        a.print();
        System.out.print("b = ");
        b.print();

        Vector3D c = a.mult(2);
        System.out.print("a * 2 = ");
        c.print();

        double d = a.dot(b);
        System.out.println("a * b = " + d);
        Vector3D cr = a.cross(b);
        System.out.print("a x b = ");
        cr.print();
    }
}
