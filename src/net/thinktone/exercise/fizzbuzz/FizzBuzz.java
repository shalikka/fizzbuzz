package net.thinktone.exercise.fizzbuzz;

import java.io.PrintStream;

public class FizzBuzz {

    public static void main(String[] args) {
        printNumbers(1, 100, System.out);
    }

    static void printNumbers(int start, int end, PrintStream outputStream) {
        for (int i = start; i <= end; i++) {
            outputStream.println(get(i));
        }
    }

    static String get(int number) {
        String result;

        if (isFizz(number) && isBuzz(number)) {
            result = "FizzBuzz";
        } else if (isFizz(number)) {
            result = "Fizz";
        } else if (isBuzz(number)) {
            result = "Buzz";
        } else {
            result = String.valueOf(number);
        }

        return result;
    }

    private static boolean isFizz(int value) {
        return value % 3 == 0 || String.valueOf(value).contains("3");
    }

    private static boolean isBuzz(int value) {
        return value % 5 == 0 || String.valueOf(value).contains("5");
    }
}
