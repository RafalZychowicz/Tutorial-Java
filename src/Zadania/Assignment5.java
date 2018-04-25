package Zadania;

public class Assignment5 {

    public static void main(String[] args) {

        System.out.println(primeCheck(5));
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
