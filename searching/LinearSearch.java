// search for a given target, returns index if found, else -1.
package searching;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        // search in a given integer array
        int[] arr = { 34, 12, 54, 829, 32, 89, 94, 37 };
        int target = 12;
        System.out.printf("Element exists at %d.", linearSearch(arr, target));

        // search in a given 2d integer array
        int[][] arr2d = {
            {1, 2, 3,}, 
            {4, 5, 6}, 
            {432, 213, 45}
        };
        int target2d = 6;
        System.out.println("Element exists at " + Arrays.toString(linearSearchIn2DArray(arr2d, target2d)));

        // search in a given integer array in a given range
        int[] arr1 = { 34, 12, 54, 829, 32, 89, 94, 37 };
        int target1 = 54;
        System.out.printf("Element exists at %d.", linearSearchInRange(arr1, target1, 2, 5));

        // search in a given string
        String str = "Himanshu Raghav";
        char letter = 'm';
        System.out.printf("Element exists at %d.", linearSearchInString(str, letter));
    }

    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    static int[] linearSearchIn2DArray(int[][] arr, int target) {

        if (arr.length == 0)
            return new int[] {-1, -1};

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[] {row, col};
            }

        }
        return new int[] {-1, -1};
    }

    static int linearSearchInRange(int[] arr, int target, int start, int end) {

        if (arr.length == 0)
            return -1;

        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    static int linearSearchInString(String str, char target) {

        if (str.length() == 0)
            return -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                return i;
        }
        return -1;
    }
}
