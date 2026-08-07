import java.util.Scanner;

class UserInput {
    int a;
    int b;

    void getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        a = scanner.nextInt();
        System.out.print("Enter second value: ");
        b = scanner.nextInt();
    }
}

class Calculate extends UserInput {
    void add() {
        System.out.println("Addition is: " + (a + b));
    }
     void sub() {
        System.out.println("Subtraction is: " + (a - b));
    }
     void mul() {
        System.out.println("Multiplication is: " + (a * b));
    }
     void div() {
        System.out.println("Division is: " + (a / b));
    }
     void mod() {
        System.out.println("Modulous is: " + (a % b));
    }
}

public class u2p4 {
    public static void main(String args[]) {
        Calculate cal = new Calculate();
        cal.getValue();
        cal.add();
        cal.sub();
        cal.mul();
        cal.div();
        cal.mod();
    }
}
