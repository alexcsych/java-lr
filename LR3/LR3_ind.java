public class LR3_ind {
    public static void main(String[] args) {
        Triangle t = new Triangle(0, 0, 4, 0, 0, 3);
        System.out.println("AB = " + t.getAB());
        System.out.println("BC = " + t.getBC());
        System.out.println("CA = " + t.getCA());
        System.out.println("Периметр = " + t.getPerimeter());
    } 
}