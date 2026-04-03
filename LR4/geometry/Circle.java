package geometry;
public class Circle extends Circumference implements ShapeActions {
    private Point center;

    public Circle(double x, double y, double radius) {
        super(radius);
        this.center = new Point(x, y);
    }

    @Override
    public void updateRadius(double newRadius) {
        if (newRadius > 0) {
            setRadius(newRadius);
        } else {
            System.out.println("Радіус має бути додатнім!");
        }
    }

    @Override
    public boolean containsPoint(Point p) {
        double distanceSquared = Math.pow(p.getX() - center.getX(), 2) + 
                                 Math.pow(p.getY() - center.getY(), 2);
        return distanceSquared <= Math.pow(radius, 2);
    }
}