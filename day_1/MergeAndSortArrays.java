import java.util.Arrays;

public class MergeAndSortArrays {
    public static void main(String[] args) {

        int[] array1 = {5, 3, 8, 1};
        int[] array2 = {7, 2, 6, 4};

        int[] mergedArray = mergeArrays(array1, array2);

        Arrays.sort(mergedArray);
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }
}
