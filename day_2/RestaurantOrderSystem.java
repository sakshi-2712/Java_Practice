import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    String itemName;
    double itemPrice;
    String itemCategory;

    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }
}

class Restaurant {
    ArrayList<MenuItem> menu;
    ArrayList<MenuItem> customerOrder;

    public Restaurant() {
        menu = new ArrayList<>();
        customerOrder = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
    }

    public void displayMenu() {
        System.out.println("\nRestaurant Menu:");
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.get(i);
            System.out.println((i + 1) + ". " + item.itemName + " (Category: " + item.itemCategory + ", Price: " + item.itemPrice + ")");
        }
    }

    public void takeOrder(int itemNumber, int quantity) {
        if (itemNumber > 0 && itemNumber <= menu.size()) {
            MenuItem orderedItem = menu.get(itemNumber - 1);
            for (int i = 0; i < quantity; i++) {
                customerOrder.add(orderedItem);
            }
            System.out.println(orderedItem.itemName + " x" + quantity + " added to your order.");
        } else {
            System.out.println("Invalid item number. Please try again.");
        }
    }

    public void displayBill() {
        if (customerOrder.isEmpty()) {
            System.out.println("No items ordered.");
            return;
        }

        double total = 0;
        System.out.println("\nYour Order:");
        for (MenuItem item : customerOrder) {
            System.out.println("- " + item.itemName + " (Price: " + item.itemPrice + ")");
            total += item.itemPrice;
        }

        System.out.println("\nTotal Bill: " + total);
    }
}

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        restaurant.addMenuItem(new MenuItem("Pizza", 10.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pasta", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Salad", 5.99, "Appetizer"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 3.99, "Dessert"));

        while (true) {
            System.out.println("\nRestaurant System Menu:");
            System.out.println("1. View Menu");
            System.out.println("2. Order Items");
            System.out.println("3. View Bill");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    restaurant.displayMenu();
                    break;
                case 2:
                    restaurant.displayMenu();
                    System.out.print("Enter item number to order: ");
                    int itemNumber = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    restaurant.takeOrder(itemNumber, quantity);
                    break;
                case 3:
                    restaurant.displayBill();
                    break;
                case 4:
                    System.out.println("Thank you for visiting! Goodbye.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
