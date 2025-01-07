import java.util.HashSet;
import java.util.Arrays;

public class DuplicateRemover {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6};


        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("Unique elements: " + Arrays.toString(uniqueArr));
    }


    public static int[] removeDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }

        return uniqueArr;
    }
}
