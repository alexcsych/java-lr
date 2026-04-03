public class LR6 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("=".repeat(30));

        for (char c = 'А'; c <= 'Я'; c++) {
            Integer i = (int) c;
            String hex = Integer.toHexString(i).toUpperCase();
            String reversedHex = new StringBuffer(hex).reverse().toString();
            System.out.println(c + " - " + i + " - " + hex + " - " + reversedHex);
            count++;
        }

        System.out.println("=".repeat(30));
        System.out.println("Всього літер: " + (count + 1));
        String name = "Олексій Сич";
        System.out.println("Олексій Сич: " + reverseCase(name));
    }

    public static char toUpperCase( char c ){
        return Character.toUpperCase(c);
    }

    public static char toLowerCase( char c ){
        return Character.toLowerCase(c);
    }

    public static String reverseCase( String s ){
        StringBuilder newStr = new StringBuilder();

        for  (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isUpperCase(c)) {
                newStr.append(toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                newStr.append(toUpperCase(c));
            } else {
                newStr.append(c);
            }
        }

        return newStr.toString();
    }
}
