// ATM Simulation
import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Initial balance
        boolean exit = false;

        while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f\n", balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid amount. Try again.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient funds or invalid amount. Try again.");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

// Electricity Bill Calculation
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        double units = scanner.nextDouble();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = 100 * 1.50 + (units - 100) * 3.00;
        } else {
            bill = 100 * 1.50 + 200 * 3.00 + (units - 300) * 5.00;
        }

        System.out.printf("Your electricity bill is: $%.2f\n", bill);

        scanner.close();
    }
}
