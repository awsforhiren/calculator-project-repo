package main.java.calculation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void whenExceptionThrown_whileInvalidInputDataProvidedTest() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(Exception.class, () -> {
            calculator.CalcResult("2 + 4 * 8 /6");
        });

        String expectedMessage = "User has provided invalid OPERAND / OPERATIONS";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        exception = assertThrows(Exception.class, () -> {
            calculator.CalcResult("");
        });

        expectedMessage = "Please provide the valid input data. Please provide data in \"Operand Operation Operand \" format";
        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void calculator_ResultTest() throws Exception {
        Calculator calc = new Calculator();
        assertTrue("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 + 3"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 Addition 3 + 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 + 3 Addition 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 + 3 + 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 + 2"));

        assertTrue("Expected & Actual Results are equals.",-1 == calc.CalcResult("2 - 3"));
        assertFalse("Expected & Actual Results are equals.",1 == calc.CalcResult("2 SUBTRACTION 3 - 2"));
        assertFalse("Expected & Actual Results are equals.",1 == calc.CalcResult("2 - 3 SUBTRACTION 2"));
        assertFalse("Expected & Actual Results are equals.",1 == calc.CalcResult("2 - 3 - 2"));
        assertTrue("Expected & Actual Results are equals.",0.0 == calc.CalcResult("2 - 2"));

        assertTrue("Expected & Actual Results are equals.",6.0 == calc.CalcResult("2 * 3"));
        assertFalse("Expected & Actual Results are equals.",24.0 == calc.CalcResult("2 MULTIPLICATION 3 * 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 * 3 MULTIPLICATION 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 * 3 * 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 * 2"));

        assertTrue("Expected & Actual Results are equals.",calc.CalcResult("2 / 3") < 1);
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 DIVISION 3 / 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 / 3 DIVISION 2"));
        assertFalse("Expected & Actual Results are equals.",5.0 == calc.CalcResult("2 / 3 / 2"));
        assertTrue("Expected & Actual Results are equals.",1.0 == calc.CalcResult("2 / 2"));

        assertTrue("Expected & Actual Results are equals.",8.0 == calc.CalcResult("2 + 4 * 8 / 6"));
    }

}