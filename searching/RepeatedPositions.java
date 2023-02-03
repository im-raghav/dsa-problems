// LEETCODE Q-> return start/end positon of repeated elements
package searching;
import java.util.Arrays;

public class RepeatedPositions {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 5, 6, 7 };
        int target = 5;
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }

    // provides the range if it exists 
    static int[] searchRange(int[] arr, int target) {

        int[] ansIndex = { -1, -1 };
        ansIndex[0] = searchPositions(arr, target, true);
        ansIndex[1] = searchPositions(arr, target, false);

        return ansIndex;
    }

    // search for the start or end poisiton of the target
    static int searchPositions(int[] arr, int target, boolean isStart) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                ans = mid;
                if (isStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

}