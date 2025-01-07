import java.util.Scanner;

public class EmployeeAttendanceTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        String[][] attendance = new String[n][7];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter attendance for Employee " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + " (Present/Absent): ");
                attendance[i][j] = scanner.next();
            }
        }

        System.out.println("\nEmployee Attendance for the Week:");
        System.out.println("Employee\tDay 1\tDay 2\tDay 3\tDay 4\tDay 5\tDay 6\tDay 7");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(attendance[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
