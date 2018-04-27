package Assignments;

public class Assignment3 {

    public static void main(String[] args) {

        Integer[] ints = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : ints){
            System.out.print(i + ", ");
            sum += i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
