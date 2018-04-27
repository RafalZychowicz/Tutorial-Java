package calc;

import java.util.ArrayList;
import java.util.Scanner;

class Misc {

    static boolean quitCheck(String input) {
        if (input.equals("quit") || input.equals("exit")) {
            return true;
        } else
            return false;
    }

    static void quit() {
        System.out.println("Bye");
        System.exit(0);
    }

    static boolean printCheck(String input) {
        if (input.equals("print")) {
            return true;
        } else
            return false;
    }

    static void print(ArrayList<Integer> numbers) {
        if (numbers.size() > 0) {
            System.out.print(numbers + "\n");
        } else {
            System.err.println("Digit list is empty, please add some numbers first");
        }
    }

    static void startOver() {
        System.out.println("Start over?");
        Scanner start = new Scanner(System.in);
        String answer = start.nextLine();
        if (answer.equals("yes") || answer.equals("y")) {
            System.out.println("Ready!");
            Main.calculate();
        } else if (answer.equals("no") || answer.equals("n")) {
            System.out.println("As you wish, bye.");
            System.exit(0);
        } else {
            System.out.println("Wrong asnwer, please type \"yes\" or \"no\"");
            startOver();
        }
    }
}
