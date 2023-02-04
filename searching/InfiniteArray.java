// given an inifinite array, find the target
package searching;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int target = 5;

        System.out.printf("The element exists at %d", findAns(arr, target));

    }

    static int findAns(int[] arr, int target) {

        // fins the range in which target lies
        int start = 0;
        int end = 1;

        while (!(target <= arr[end])) {

            start = end + 1;
            end = start * 2 + 1;
        }
        return binarySearchInRange(arr, target, start, end);

    }

    static int binarySearchInRange(int[] arr, int target, int start, int end) {

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
        return -1;
    }

}