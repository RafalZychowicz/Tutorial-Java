package Methods;

public class methods {

    public static void main(String[] args) {

        sayHi();
        hi("Michal");
        hi("Karol", "Andrzej");
        hello("Rafal", "Jacek", "Magda", "Joanna");

        System.out.println(addition(2, 3, 5));
        System.out.println(checkBy3(9));

        System.out.println(factorial(8));
    }

    private static void sayHi() {
        System.out.println("Hi, Rafal");
    }

    private static void hi(String name) {
        System.out.println("Hi, " + name);
    }

    private static void hi(String name, String name2) {
        System.out.println("Hi, " + name + ", " + name2);
    }

    private static void hello(String... names) {
        String result = "";
        for (String s : names) {
            result = result + s + ", ";
        }
        System.out.println("Hi, " + result);
    }

    private static int addition(int... a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    private static boolean checkBy3(int a) {

        return a % 3 == 0;
    }

    private static void foo() {
        System.out.println("foo");
        foo();
    }

    // n! // 5! = 5*4*3*2*1

    private static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
