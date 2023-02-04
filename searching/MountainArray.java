// Q.find the peak in mountain array 
package searching;

public class MountainArray {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        System.out.printf("The peak exists at index %d", findPeak(arr));
    }

    static int findPeak(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }

        while (start < end ) {
            int mid = start + (end - start) / 2;
            // increasing part, search in right 
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } 
            // decreasing part, search in left
            else {
                end = mid;
            }
        }
        return start;
    }
}