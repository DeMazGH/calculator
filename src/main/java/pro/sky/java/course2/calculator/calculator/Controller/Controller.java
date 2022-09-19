package pro.sky.java.course2.calculator.calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.calculator.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.calculateSum(num1,num2);
    }

    @GetMapping("/minus")
    public String showDifference(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.calculateDifference(num1,num2);
    }

    @GetMapping("/multiply")
    public String showMultiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.calculateMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String showQuotient(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.calculateQuotient(num1, num2);
    }

}
