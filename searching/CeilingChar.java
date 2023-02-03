// Q -> ceiling of a given target char = smallest char greater than or equal to target.
package searching;

public class CeilingChar {
    public static void main(String[] args) {

        char[] arr = { 'a', 'c', 'j' };
        char target = 'a';
        System.out.printf("The ceiling of the target exists at %d.", ceilingChar(arr, target));

    }

    static int ceilingChar(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start % arr.length;
    }
}