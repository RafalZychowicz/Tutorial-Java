package Assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Assignment14 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();

        System.out.println("Write digits then type \"+\" or \"*\" to get sum or product respectively.");
        System.out.println("Use \"print\" to see digits already added to list.");
        System.out.println("You can also type \"quit\" or \"exit\" to close this app");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String input = br.readLine();
                if (input.equals("quit") || input.equals("exit")) {
                    System.out.println("Bye");
                    System.exit(0);
                } else if (input.equals("print")){
                    if (numbers.size() > 1) {
                        System.out.print(numbers + "\n");
                    } else {
                        System.err.println("Digit list is empty, please add some numbers first");
                    }
                } else if (input.equals("+") || input.equals("*")) {
                    if (numbers.size() >= 2) {
                        Integer result;
                        if (input.equals("+"))
                            result = 0;
                        else
                            result = 1;

                        for (Integer i : numbers) {
                            if (input.equals("+"))
                                result += i;
                            else
                                result *= i;
                        }
                        System.out.println("Calculations result: " + result);
                        System.exit(0);

                    } else {
                        System.err.println("Not enough numbers to perform Misc, please add more than one.");
                    }
                } else {
                    try {
                        numbers.add(Integer.parseInt(input));
                    } catch (NumberFormatException nfe) {
                        System.err.println("Wrong input, please write digit.");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}