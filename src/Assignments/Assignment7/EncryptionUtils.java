package Assignments.Assignment7;

public class EncryptionUtils {

    public static String encode (String code) {
        char[] chars = code.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (primeCheck(i));
                chars[i] += 5;
        }
        StringBuilder sbr = new StringBuilder();
        for (char n : chars){
            sbr.append(n);
        }
        String result = sbr.toString();
        return result;
    }

    public static String decode (String code) {
        char[] chars = code.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (primeCheck(i));
            chars[i] -= 5;
        }
        StringBuilder sbr = new StringBuilder();
        for (char n : chars) {
            sbr.append(n);
        }
        String result = sbr.toString();
        return result;
    }

    private static boolean primeCheck(int n) {
        boolean prime = true;
        int i = n;

        for (; i > 1; i -= 1) {
            if (n % i == 0)
                prime = false;
            else
                prime = true;
        }
        return prime;
    }
}
