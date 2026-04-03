import java.util.Scanner;

public class LR1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість чисел n: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введіть " + n + " цілих чисел:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Числа-паліндроми:");

        for (int i = 0; i < n; i++) {
            if (isPalindrome(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}