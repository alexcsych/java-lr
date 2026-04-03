public class Cylinder {
    double radius;
    double height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}