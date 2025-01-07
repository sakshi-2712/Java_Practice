import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortAscDec {

    public static void sortAscending(Integer[] arr) {
        Arrays.sort(arr);
    }


    public static void sortDescending(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        Integer[] arr = new Integer[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        sortAscending(arr);
        System.out.println("Array in ascending order: " + Arrays.toString(arr));

        sortDescending(arr);
        System.out.println("Array in descending order: " + Arrays.toString(arr));

        scanner.close();
    }
}
