package net.thinktone.exercise.fizzbuzz;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        List<Integer> fizzList = Arrays.asList(3, 6, 9, 12, 18, 21, 24, 27, 33, 36,
                 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99);

        for (int i = 1; i < 101; i++) {
            if (fizzList.contains(i)) {
                assertThat("Test Fizz for " + i, FizzBuzz.get(i), equalTo("Fizz"));
            } else {
                assertThat("Test Fizz for " + i, FizzBuzz.get(i), not(equalTo("Fizz")));
            }
        }
    }

    @Test
    public void testBuzz() {
        List<Integer> buzzList = Arrays.asList(5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100);

        for (int i = 1; i < 101; i++) {
            if (buzzList.contains(i)) {
                assertThat("Test Buzz for" + i, FizzBuzz.get(i), equalTo("Buzz"));
            } else {
                assertThat("Test Buzz for" + i, FizzBuzz.get(i), not(equalTo("Buzz")));
            }
        }
    }

    @Test
    public void testFizzBuzz() {
        List<Integer> fizzBuzzList = Arrays.asList(15, 30, 45, 60, 75, 90);

        for (int i = 1; i < 101; i++) {
            if (fizzBuzzList.contains(i)) {
                assertThat("Test FizzBuzz for" + i, FizzBuzz.get(i), equalTo("FizzBuzz"));
            } else {
                assertThat("Test FizzBuzz for" + i, FizzBuzz.get(i), not(equalTo("FizzBuzz")));
            }
        }
    }

    @Test
    public void testNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 7, 8);
        for (int i = 1; i < 10; i++) {
            String expected = String.valueOf(i);
            if (numbers.contains(i)) {
                assertThat("Test numbers for" + i, FizzBuzz.get(i), equalTo(expected));
            } else {
                assertThat("Test numbers for" + i, FizzBuzz.get(i), not(equalTo(expected)));
            }
        }
    }

    @Test
    public void testPrintNumbers() {
        String [] expected = {"Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
                "Fizz", "13", "14", "FizzBuzz"};
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        FizzBuzz.printNumbers(3, 15, new PrintStream(outStream));

        String [] output = (outStream.toString()).split(System.getProperty("line.separator"));
        for (int i = 0; i < output.length; i++) {
            assertThat("Test print numbers for" + i, output[i], equalTo(expected[i]));
        }
    }
}
