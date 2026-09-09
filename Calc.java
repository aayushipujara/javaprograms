import calculator.operations.Add;
import calculator.operations.Div;
import calculator.operations.Mod;
import calculator.operations.Mul;
import calculator.operations.Sub;

public class Calc {
    public static void main(String[] args) {
        double num1 = 12.0;
        double num2 = 4.0;

        Add addition = new Add();
        Sub subtraction = new Sub();
        Mul multiplication = new Mul();
        Div division = new Div();
        Mod modulo = new Mod();

        System.out.println("Addition: " + addition.calculate(num1, num2));
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
        System.out.println("Division: " + division.calculate(num1, num2));
        System.out.println("Modulo: " + modulo.calculate(num1, num2));
    }
}
