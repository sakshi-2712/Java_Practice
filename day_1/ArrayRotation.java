import java.util.Arrays;

public class ArrayRotation {
    public static void rotate(int[] arr, int n) {
        int length = arr.length;

        n = n % length;

        int[] temp = new int[n];

        System.arraycopy(arr, length - n, temp, 0, n);

        System.arraycopy(arr, 0, arr, n, length - n);

        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Original array: " + Arrays.toString(arr));

        rotate(arr, n);

        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
