package unitTests;

import Code.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void sumPositiveNumbersTest() {
        float first = 3f;
        float second = 5f;
        float result = Calculator.sum(first, second);
        Assert.assertEquals("Sum work right with result:", first + second, result, 0);
    }

    @Test
    public void sumPositiveAndNegativeNumbersTest() {
        float first = 5f;
        float second = -3f;
        float result = Calculator.sum(first, second);
        Assert.assertEquals("Sum work right with result:", first + second, result, 0);
    }
}
