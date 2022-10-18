package pro.sky.java.course2.calculator.calculator.exeption;

public class DivisionByZeroExeption extends IllegalArgumentException{
    public DivisionByZeroExeption() {
    }

    public DivisionByZeroExeption(String s) {
        super(s);
    }

    public DivisionByZeroExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroExeption(Throwable cause) {
        super(cause);
    }
}
