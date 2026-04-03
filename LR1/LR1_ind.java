import java.util.*;

public class LR1_ind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмірність матриці n: ");
        int n = sc.nextInt();
        System.out.print("Введіть розмірність матриці m: ");
        int m = sc.nextInt();
        float[][] matrix = new float[n][m];

        System.out.println("Введіть " + n * m + " дійсних чисел:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextFloat();
            }
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            float sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
            float avg = sum / m;
            for (int j = 0; j < m; j++) {
                matrix[i][j] -= avg;
            }
        }

        System.out.println("Матриця після перестановки:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}