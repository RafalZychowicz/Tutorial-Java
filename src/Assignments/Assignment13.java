package Assignments;

public class Assignment13 {

    public static void main(String[] args) {

        int x = 4;
        int y = 0;

        try {
            System.out.println((x / y));
        } catch (ArithmeticException e) {
            System.err.println("Can't " + e.getMessage());
            System.exit(0);
        } catch (Exception e1) {
            System.err.println("Something went wrong.");
        } finally {
            System.out.println("Finally");
        }
    }
}
