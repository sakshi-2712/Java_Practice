import java.util.Scanner;

public class GroceryBillingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            double totalBill = 0;
            System.out.println("\nEnter details for Customer " + i);

            while (true) {
                System.out.print("Enter the price of item (or type 0 to finish): ");
                double price = scanner.nextDouble();

                if (price == 0) {
                    break;
                }

                totalBill += price;
            }

            System.out.println("Total bill for Customer " + i + ": " + totalBill);
        }

        scanner.close();
    }
}
