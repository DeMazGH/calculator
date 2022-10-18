package pro.sky.java.course2.calculator.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    private Integer num1;
    private Integer num2;
    private Integer num3;
    private Integer num4;

    @BeforeEach
    public void setup() {
        num1 = 3;
        num2 = 4;
        num3 = -4;
        num4 = -5;
    }

    @Test
    public void calculateSum() {
        Integer expected1 = out.calculateSum(num1, num2);
        Integer actual1 = num1 + num2;
        Integer expected2 = out.calculateSum(num3, num4);
        Integer actual2 = num3 + num4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void calculateDifference() {
        Integer expected1 = out.calculateDifference(num1, num2);
        Integer actual1 = num1 - num2;
        Integer expected2 = out.calculateDifference(num3, num4);
        Integer actual2 = num3 - num4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void calculateMultiplication() {
        Integer expected1 = out.calculateMultiplication(num1, num2);
        Integer actual1 = num1 * num2;
        Integer expected2 = out.calculateMultiplication(num3, num4);
        Integer actual2 = num3 * num4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void calculateQuotient() {
        Integer num0 = 0;

        Double expected1 = out.calculateQuotient(num1, num2);
        Double actual1 = (double) num1 / num2;
        Double expected2 = out.calculateQuotient(num3, num4);
        Double actual2 = (double) num3 / num4;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertThrows(IllegalArgumentException.class, () -> out.calculateQuotient(num1,num0));
    }
}
