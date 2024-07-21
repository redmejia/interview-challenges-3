package OneGoneMissing;
/*
Given an array that contains all distinct values from zero through N except one number, return the number that is missing from the array.

Ex: Given the following array nums…

nums = [1, 4, 2, 0], return 3.
3 is the only number missing in the array between 0 and 4.

Time Complexity

Formula n x ( n + 1 ) / 2 is constant time O(1)

Space complexity:
is O(1) for the variables `expectedSum` and `actualSum`

Summary
Time Complexity : O(n)
Space Complexity : O(1)

 */
public class OneGoneMissing {

    public static int findMissing(int[] arr) {

        int n = arr.length;

        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;

    }

    public static void main(String[] args) {

        int[] n = {6, 3, 1, 2, 0, 5};

        System.out.println(findMissing(n));

    }
}

