package Zadania;

public class Assignment5Alt {

    public static void main(String[] args) {

        primeCheck(1, 2, 3, 4, 5, 6, 7);
    }

    private static void primeCheck(int... ints) {
        boolean isPrime = true;

        for (int i : ints) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) isPrime = false;
            }
            if (isPrime)
                System.out.println(i + " Is Prime!");
            else
                System.out.println(i + " Is not Prime");
        }
    }
}