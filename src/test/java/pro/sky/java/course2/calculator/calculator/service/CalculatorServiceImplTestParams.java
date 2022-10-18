package pro.sky.java.course2.calculator.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTestParams {
    private final CalculatorService out = new CalculatorServiceImpl();

    public static final Integer num1 = 3;
    public static final Integer num2 = 4;
    public static final Integer num3 = -4;
    public static final Integer num4 = -5;

    @ParameterizedTest
    @MethodSource("calculateSumTestParam")
    public void calculateSum(Integer firstNum, Integer secondNum) {
        Integer expected = out.calculateSum(firstNum, secondNum);
        Integer actual = firstNum + secondNum;
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> calculateSumTestParam() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }

    @ParameterizedTest
    @MethodSource("calculateDifferenceTestParam")
    public void calculateDifference(Integer firstNum, Integer secondNum) {
        Integer expected = out.calculateDifference(firstNum, secondNum);
        Integer actual = firstNum - secondNum;
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> calculateDifferenceTestParam() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }

    @ParameterizedTest
    @MethodSource("calculateMultiplicationTestParam")
    public void calculateMultiplication(Integer firstNum, Integer secondNum) {
        Integer expected = out.calculateMultiplication(firstNum, secondNum);
        Integer actual = firstNum * secondNum;
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> calculateMultiplicationTestParam() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }

    @ParameterizedTest
    @MethodSource("calculateQuotientTestParam")
    public void calculateQuotient(Integer firstNum, Integer secondNum) {
        Double expected = out.calculateQuotient(firstNum, secondNum);
        Double actual = (double) firstNum / secondNum;
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> calculateQuotientTestParam() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }
}
