import java.util.Scanner;

public class ShoppingCartDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total price of items in your cart: $");
        double totalPrice = scanner.nextDouble();

        double finalPrice;
        if (totalPrice > 500) {

            finalPrice = totalPrice - (totalPrice * 0.10);
        } else if (totalPrice >= 200) {

            finalPrice = totalPrice - (totalPrice * 0.05);
        } else {
            finalPrice = totalPrice;
        }

        System.out.println("The final price after discount is: $" + finalPrice);
        scanner.close();
    }
}
