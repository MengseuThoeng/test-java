package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test(timeout = 5000) // 5-second timeout
    public void testEvenNumber() {
        Main.main(new String[] {"4"}); // Simulate input 4
        Assert.assertEquals("The number 4 is Even", Main.getOutput());
    }

    @Test(timeout = 5000)
    public void testOddNumber() {
        Main.main(new String[] {"7"}); // Simulate input 7
        Assert.assertEquals("The number 7 is Odd", Main.getOutput());
    }
    @Test
    public void testInvalidInput() {
        Main.main(new String[] {"abc"}); // Simulate input abc
        Assert.assertEquals("Invalid input. Please enter a number.", Main.getOutput());
    }

    // Add more tests to cover edge cases or other inputs
}
