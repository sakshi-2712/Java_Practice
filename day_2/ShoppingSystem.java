import java.util.ArrayList;
import java.util.Scanner;


class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Cart {
    ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.name + " added to the cart.");
    }

    public void removeProduct(String productName) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equalsIgnoreCase(productName)) {
                products.remove(i);
                System.out.println(productName + " removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in the cart.");
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart contents:");
            for (Product product : products) {
                System.out.println("- " + product.name + " (Price: " + product.price + ", Quantity: " + product.quantity + ")");
            }
        }
    }
}

public class ShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Calculate Total Price");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    cart.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter the name of the product to remove: ");
                    String productName = scanner.nextLine();
                    cart.removeProduct(productName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Total Price: " + cart.calculateTotalPrice());
                    break;
                case 5:
                    System.out.println("Thank you for using the Shopping Cart System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
