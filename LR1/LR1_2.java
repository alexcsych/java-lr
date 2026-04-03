import java.util.*;

public class LR1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмірність матриці n: ");
        int n = sc.nextInt();
        float[][] matrix = new float[n][n];

        System.out.println("Введіть " + n * n + " дійсних чисел:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextFloat();
            }
        }

        sc.close();

        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                elements.add(new Element(matrix[i][j], i, j));
            }
        }

        elements.sort((a, b) -> Float.compare(b.value, a.value));

        for (int i = 0; i < n; i++) {
            Element maxElement = elements.get(i);
            float temp = matrix[i][i];
            matrix[i][i] = matrix[maxElement.i][maxElement.j];
            matrix[maxElement.i][maxElement.j] = temp;
            maxElement.i = i;
            maxElement.j = i;
        }

        System.out.println("Матриця після перестановки:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static class Element {
        float value;
        int i, j;

        Element(float value, int i, int j) {
            this.value = value;
            this.i = i;
            this.j = j;
        }
    }
}