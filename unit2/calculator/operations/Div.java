package calculator.operations;

public class Div {
    public double calculate(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    }
}
