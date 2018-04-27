package calc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

class Calc {

    static boolean mathCheck(String input) {
        if (input.equals("+") || input.equals("*")) {
            return true;
        } else
            return false;
    }

    static void doMath(String input, ArrayList<Integer> numbers) {
        Integer result = 0;
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
    }

    static void math(Boolean notDone, ArrayList<Integer> numbers) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (notDone) {
                String input = br.readLine();
                if (Misc.quitCheck(input)) {
                    Misc.quit();
                } else if (Misc.printCheck(input)) {
                    Misc.print(numbers);
                } else if (Calc.mathCheck(input)) {
                    if (numbers.size() >= 2) {
                        Calc.doMath(input, numbers);
                        numbers.clear();
                        notDone =false;
                        Misc.startOver();
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
