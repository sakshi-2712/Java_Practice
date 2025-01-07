import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double temperature;

        switch (choice) {
            case 1:

                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = (temperature * 9/5) + 32;
                System.out.println(temperature + " Celsius is " + fahrenheit + " Fahrenheit.");
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = (temperature - 32) * 5/9;
                System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
                break;
        }

        scanner.close();
    }
}
