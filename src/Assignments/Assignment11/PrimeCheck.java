package Assignments.Assignment11;

import utils.StrUtils;

public class PrimeCheck {

    public static String primeList(int x, int y) {

        StringBuilder sb = new StringBuilder();
        for (; x <= y; x++) {
            if (primeCheck(x)) {
                sb.append(x);
                sb.append(", ");
            }
        }
        String result = sb.toString();
        return StrUtils.removeLastSeparator(result, ", ");
    }

    private static boolean primeCheck(int n) {
        boolean prime = true;
        int i = n - 1;

        for (; i > 1; i -= 1) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
