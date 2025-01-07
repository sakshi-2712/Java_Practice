public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};


        int target = 30;

        int position = searchElement(arr, target);

        if (position != -1) {
            System.out.println("Element " + target + " found at position: " + position);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }


    public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
