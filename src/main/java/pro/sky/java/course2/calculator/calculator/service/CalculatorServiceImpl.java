package pro.sky.java.course2.calculator.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.calculator.exeption.DivisionByZeroExeption;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int calculateSum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int calculateDifference(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int calculateMultiplication(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public double calculateQuotient(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivisionByZeroExeption("Нельзя делить на ноль");
        }
        return (double) num1 / num2;
    }
}
