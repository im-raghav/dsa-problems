// Q -> ceiling of a number = smallest number greater than or equal to num.
package searching;

public class Floor {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 9, 12, 15, 18 };
        int target = 0;
        System.out.printf("The floor of the target exists at %d.", floor(arr, target));

    }

    static int floor(int[] arr, int target) {
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
        return end;
    }
}