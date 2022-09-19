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
    public int calculateQuotient(int num1, int num2) {
        if (num2 == 0) {

        }
        return num1 / num2;
    }
}
