// LEETCODE Q.1672 -> each row = customer, each col = their bank account. FIND MOST WEALTH one customer has
package searching;

public class RichestCustomer {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 6, 5, 3 }
        };

        System.out.printf("Most wealth one customer has is %d", wealthy(arr));

    }

    static int wealthy(int[][] arr) {

        int maxWealth = Integer.MIN_VALUE;

        for (int customer = 0; customer < arr.length; customer++) {
            int customerWealth = 0;
            for (int bankAccount = 0; bankAccount < arr[customer].length; bankAccount++) {
                customerWealth += arr[customer][bankAccount];
            }
            if (customerWealth > maxWealth)
                maxWealth = customerWealth;
        }
        return maxWealth;
    }
}