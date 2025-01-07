import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (password.length() >= 8 && password.matches(".*[a-zA-Z].*") && password.matches(".*[0-9].*")) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid. It must be at least 8 characters long and contain both letters and numbers.");
        }

        scanner.close();
    }
}
