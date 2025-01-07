import java.util.ArrayList;
import java.util.Date;

class Customer {
    int customerId;
    String name;
    String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Order {
    int orderId;
    Date orderDate;
    ArrayList<String> orderedItems;

    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderedItems = new ArrayList<>();
    }

    public void addItem(String item) {
        orderedItems.add(item);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Ordered Items: " + orderedItems);
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "sakshi aher", "nashik");

        Order order = new Order(1001, new Date());

        order.addItem("Laptop");
        order.addItem("Mouse");
        order.addItem("Keyboard");

        System.out.println("Customer Details:");
        customer.displayCustomerDetails();

        System.out.println("\nOrder Details:");
        order.displayOrderDetails();
    }
}
