public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public Vector3D mult(double num) {
        return new Vector3D(x * num, y * num, z * num);
    }
    public double dot(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }
    public Vector3D cross(Vector3D v) {
        double resX = y * v.z - z * v.y;
        double resY = z * v.x - x * v.z;
        double resZ = x * v.y - y * v.x;
        return new Vector3D(resX, resY, resZ);
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}
