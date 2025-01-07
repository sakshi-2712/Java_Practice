import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen of the country? (yes/no): ");
        String citizen = scanner.next().toLowerCase();

        if (age >= 18 && citizen.equals("yes")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
