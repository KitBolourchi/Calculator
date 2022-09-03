import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        System.out.println("=================================");

        Calculation calculation = chooseOperation();
        System.out.println("=================================");

        int[] numbers = chooseNumbers();
        System.out.println("=================================");

        int Sum = calculate(calculation, numbers);

        System.out.println("Sum: " + Sum);
    }

    private static Calculation chooseOperation() {
        System.out.print("Select '+' (ADD), '*'(MULTIPLY), '-' (SUBTRACT): ");
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

    private static int[] chooseNumbers() {
        System.out.print("How many numbers? ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        for(int i = 0; i<numbers.length; i++) {
            System.out.print("Choose number " + (i+1) + ": ");
            int numInput = scanner.nextInt();
            numbers[i] = numInput;
        }
        return numbers;
    }

    private static int calculate(Calculation calculation, int[] numbers) {
        int total = numbers[0];
        for(int i = 1; i<numbers.length; i++) {
            total = calculation.calculate(total, numbers[i]);
        }
        return total;
    }
}
