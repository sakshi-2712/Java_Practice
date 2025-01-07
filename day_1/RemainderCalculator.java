import java.util.Scanner;

public class RemainderCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int remainder = firstNumber % secondNumber;

        System.out.println("The remainder when " + firstNumber + " is divided by " + secondNumber + " is: " + remainder);

        scanner.close();
    }
}
