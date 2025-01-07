import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * 3.14 * radius;
        double area = 3.14 * radius * radius;

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        scanner.close();
    }
}

