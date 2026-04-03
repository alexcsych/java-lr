public class Tetrahedron {
    double a;

    public Tetrahedron(double a) {
        this.a = a;
    }

    public double getSurfaceArea() {
        return Math.sqrt(3) * a * a;
    }

    public double getVolume() {
        return (a * a * a) / (6 * Math.sqrt(2));
    }
}