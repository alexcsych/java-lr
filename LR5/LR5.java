import java.math.*;

public class LR5 {
    public static void main(String[] args) {
        double n = 15.0;

        for (double x = 0; x <= n; x += n / 5) {
            System.out.println("\n" + "=".repeat(30));
            System.out.printf("Вхідне значення x = %.2f\n", x);
            System.out.println("=".repeat(30));
            
            Double resSinD = Math.sin(x / n);
            Double resTanD = Math.tan(x / n);
            System.out.println("[Double] Sin: " + format15(resSinD));
            System.out.println("[Double] Tan: " + format15(resTanD));

            Integer resSinI = (int) Math.sin(x / n);
            Integer resTanI = (int) Math.tan(x / n);
            System.out.println("[Integer] Sin: " + resSinI);
            System.out.println("[Integer] Tan: " + resTanI);

            Float resCosF = (float) Math.cos(x / n);
            Float resCtanF = (float) (1.0 / Math.tan(x / n));
            System.out.println("[Float] Cos: " + format15(resCosF.doubleValue()));
            System.out.println("[Float] Ctan: " + format15(resCtanF.doubleValue()));

            Long resCosL = (long) Math.cos(x / n);
            Long resCtanL = (long) (1.0 / Math.tan(x / n));
            System.out.println("[Long] Cos: " + resCosL);
            System.out.println("[Long] Ctan: " + resCtanL);
        }
    }

    public static String format15(double value) {
        if (Double.isInfinite(value) || Double.isNaN(value)) return String.valueOf(value);
        
        return new BigDecimal(value)
                .setScale(15, RoundingMode.HALF_UP)
                .toString();
    }
}