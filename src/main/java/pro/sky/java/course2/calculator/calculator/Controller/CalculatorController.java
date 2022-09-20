package pro.sky.java.course2.calculator.calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.calculator.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        int plus = calculatorService.calculateSum(num1,num2);
        return num1 + " + " + num2 + " = " + plus;
    }

    @GetMapping("/minus")
    public String showDifference(@RequestParam int num1, @RequestParam int num2) {
        int difference = calculatorService.calculateDifference(num1,num2);
        return num1 + " - " + num2 + " = " + difference;
    }

    @GetMapping("/multiply")
    public String showMultiplication(@RequestParam int num1, @RequestParam int num2) {
        int multiply = calculatorService.calculateMultiplication(num1, num2);
        return num1 + " * " + num2 + " = " + multiply;
    }

    @GetMapping("/divide")
    public String showQuotient(@RequestParam int num1, @RequestParam int num2) {
        double divide;
        try {
            divide = calculatorService.calculateQuotient(num1, num2);
        } catch (Throwable throwable) {
            return throwable.getMessage();
        }
        return num1 + " / " + num2 + " = " + divide;
    }

}
