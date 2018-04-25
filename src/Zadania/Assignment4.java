package Zadania;

public class Assignment4 {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i += 1) {
            if (i == 999) {
                System.out.print(i);
            } else if (i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
