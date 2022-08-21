import java.util.Random;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the calculator!");
        System.out.println("================================");

        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        System.out.println("Number 1: " + randomNumber1);
        System.out.println("Number 2: " + randomNumber2);

        System.out.println("Select '+' (ADD), '*'(MULTIPLY), '-' (SUBTRACT)");
        String operation = scanner.nextLine();
        System.out.println("================================");

        System.out.print(randomNumber1 + " " + operation + " " + randomNumber2 + " = ");

        if (operation.equals("+")) {
            System.out.print(randomNumber1 + randomNumber2);
        } else if (operation.equals("*")) {
            System.out.print(randomNumber1 * randomNumber2);
        } else {
            System.out.print(randomNumber1 - randomNumber2);
        }
    }
}
