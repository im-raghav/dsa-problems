// Q -> ceiling of a number = smallest number greater than or equal to num.
package searching;

public class Ceiling {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 9, 12, 15, 18 };
        int target = 0;
        System.out.printf("The ceiling of the target exists at %d.", ceiling(arr, target));

    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // edge cases when mid is last element and start exceeds arr.length
        if (start >= arr.length) {
            return -1;
        }
        return start;
    }
}