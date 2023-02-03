// LEETCODE Q.1295. - Find numbers with even number of digits
package searching;

public class EvenDigitsElements {
    public static void main(String[] args) {

        int[] arr = { 142, 32432, 32532, 42523, 985329, -23, -23 };
        int count = 0;

        // checks if empty array, no element to check then
        if (arr.length == 0)
            System.out.println("Empty array");

        for (int i = 0; i < arr.length; i++) {
            if (countDigits(arr[i]) % 2 == 0)
                count++;
        }
        System.out.printf("Total %d elements have even no. of digits.", count);
    }

    static int countDigits(int num) {
        int noOfDigits = 0;

        while (num != 0) {
            noOfDigits++;
            num /= 10;
        }
        return noOfDigits;
    }
}