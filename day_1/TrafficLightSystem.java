import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine().toLowerCase();

        System.out.print("Is there an obstacle? (yes/no): ");
        String obstacle = scanner.nextLine().toLowerCase();

        if (obstacle.equals("yes")) {
            System.out.println("You cannot move because there's an obstacle.");
        } else {

            if (lightColor.equals("green")) {
                System.out.println("Go!");
            } else if (lightColor.equals("yellow")) {
                System.out.println("Slow down!");
            } else if (lightColor.equals("red")) {
                System.out.println("Stop!");
            } else {
                System.out.println("Invalid light color.");
            }
        }

        scanner.close();
    }
}
