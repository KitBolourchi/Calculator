import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        System.out.println("================================");

        System.out.print("Select your first number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Select your second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Select '+' (ADD), '*'(MULTIPLY), '-' (SUBTRACT)");
        String operation = scanner.nextLine();
        System.out.println("================================");

        System.out.print(number1 + " " + operation + " " + number2 + " = ");

        if (operation.equals("+")) {
            System.out.print(number1 + number2);
        } else if (operation.equals("*")) {
            System.out.print(number1 * number2);
        } else {
            System.out.print(number1 - number2);
        }
    }
}
