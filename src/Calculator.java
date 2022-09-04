import java.util.Scanner;
import java.util.ArrayList;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator!");
        System.out.println("=================================");

        Calculation operation = chooseOperation();
        System.out.println("=================================");

        ArrayList<Integer> numbers = chooseNumbers();
        System.out.println("=================================");

        int Sum = calculate(operation, numbers);

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

    private static ArrayList<Integer> chooseNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String firstNum = scanner.nextLine();
        numbers.add(Integer.parseInt(firstNum));

        while(true) {
            System.out.print("Enter another number or enter 'done' when finished: ");
            String input = scanner.nextLine();

            if (input.equals("done")) {
                break;
            } else {
                numbers.add(Integer.parseInt(input));
            }
        }
        return numbers;
    }

    private static int calculate(Calculation calculation, ArrayList<Integer> numbers) {
        int total = numbers.get(0);
        for(int i = 1; i<numbers.size(); i++) {
            total = calculation.calculate(total, numbers.get(i));
        }
        return total;
    }
}
