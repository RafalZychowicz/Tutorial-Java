package Basic;

public class table {

    public static void main(String[] args) {

        Integer[] ints = {3, 6, 9};

        System.out.println(ints[0] + ints[1]);
        System.out.println(ints[2] * ints[1]);

        System.out.println((ints[1] + ints[0]) * ints[2]);

        Integer[] intsLong = new Integer[3];

        intsLong[0] = 1;
        intsLong[1] = 2;
        intsLong[2] = 3;

        System.out.println(intsLong[2] + intsLong[1] + intsLong[0]);
    }
}
