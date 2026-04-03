public class Triangle {
    double x1, y1;
    double x2, y2;
    double x3, y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getAB() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double getBC() {
        return Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    }

    public double getCA() {
        return Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
    }

    public double getPerimeter() {
        return getAB() + getBC() + getCA();
    }
}