import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        System.out.println("=================================");

        System.out.print("Select your first number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Select your second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        Calculation operation = chooseOperation();
        System.out.println("=================================");

        int sum = operation.calculate(number1, number2);
        System.out.println("Sum: " + sum);
    }

    private static Calculation chooseOperation() {
        System.out.println("Select '+' (ADD), '*'(MULTIPLY), '-' (SUBTRACT)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals("+")) {
            return new Addition();
        } else if (input.equals("*")) {
            return new Multiply();
        } else {
            return new Subtraction();
        }

    }
}
