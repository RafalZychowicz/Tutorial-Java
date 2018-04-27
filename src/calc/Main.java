package calc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList();

        System.out.println("Write digits then type \"+\" or \"*\" to get sum or product respectively.");
        System.out.println("Use \"print\" to see digits already added to list.");
        System.out.println("You can also type \"quit\" or \"exit\" to close this app");

        calculate();
    }

    static void calculate() {
        ArrayList<Integer> numbers = new ArrayList();
        Calc.math(true, numbers);
    }
}
