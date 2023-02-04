// Q-> search target in Mountain Array
package searching;

public class SearchInMountainArray {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, -1};
        int target = -1;
        System.out.printf("The target exists at index %d. ", searchInMountainArray(arr, target));

    }

    static int searchInMountainArray(int[] arr, int target) {

        int peak = MountainArray.findPeak(arr);
        int firstHalf = orderAgnosticBSInRange(arr, target, 0, peak);

        if (firstHalf != -1) {
            return firstHalf;
        } else {
            return orderAgnosticBSInRange(arr, target, peak + 1, arr.length);
        }
    }

    static int orderAgnosticBSInRange(int[] arr, int target, int start, int end) {

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