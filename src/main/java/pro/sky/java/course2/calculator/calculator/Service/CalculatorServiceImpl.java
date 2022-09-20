package pro.sky.java.course2.calculator.calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int calculateDifference(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculateMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double calculateQuotient(int num1, int num2) {
        if (num2 == 0) {
            throw new RuntimeException("Нельзя делить на ноль");
        }
        return (double) num1 / num2;
    }
}
