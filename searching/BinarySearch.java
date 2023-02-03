// implements binary search
package searching;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;

        // System.out.printf("The element exists at index %d.", binarySearch(arr, target));
        System.out.printf("The element exists at index %d.", orderAgnosticBS(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
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
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            // increasing order
            if (arr[0] < arr[arr.length - 1]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            // decreasing order
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
}