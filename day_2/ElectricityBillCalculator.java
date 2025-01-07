import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        // Initialize bill amount
        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 1.0;
        } else if (units <= 200) {
            billAmount = (100 * 1.0) + ((units - 100) * 2.0);
        } else {
            billAmount = (100 * 1.0) + (100 * 2.0) + ((units - 200) * 3.0);
        }

        System.out.println("The total electricity bill is: $" + billAmount);

        scanner.close();
    }
}
