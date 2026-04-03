import java.util.Scanner;

public class LR6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість слів (n): ");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Введіть " + n + " слів через пробіл або Enter:");
        
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        int latinOnlyCount = 0;
        int equalVowelsConsonantsCount = 0;
        
        for (String word : words) {
            if (isLatinOnly(word)) {
                latinOnlyCount++;
                if (hasEqualVowelsAndConsonants(word)) {
                    equalVowelsConsonantsCount++;
                }
            }
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("Слів тільки латиницею: " + latinOnlyCount);
        System.out.println("З них з однаковою кількістю голосних і приголосних: " + equalVowelsConsonantsCount);
    }

    public static boolean isLatinOnly(String s) {
        return s.matches("^[a-zA-Z]+$");
    }

    public static boolean hasEqualVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        String lowerS = s.toLowerCase();
        String allVowels = "aeiouy";
        
        for (int i = 0; i < lowerS.length(); i++) {
            char c = lowerS.charAt(i);

            if (Character.isLetter(c)) {
                if (allVowels.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        return vowels == consonants && (vowels + consonants) > 0;
    }
}