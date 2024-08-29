package calculator.app;

public class Main {

    public Integer addition(Integer a, Integer b) {
        return a + b;
    }

    public Integer subtraction(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiplication(Integer a, Integer b) {
        return a * b;
    }

    public Integer division(Integer a, Integer b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
