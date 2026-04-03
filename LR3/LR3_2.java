public class LR3_2 {
    public static void main(String[] args) {
        Tetrahedron t = new Tetrahedron(4);
        System.out.println("Площа поверхні: " + t.getSurfaceArea());
        System.out.println("Об'єм: " + t.getVolume());
    }
}