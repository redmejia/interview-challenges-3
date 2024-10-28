package ContinuousSums;

import java.util.HashMap;

/*
Given an array of integers, nums, and a value k, return the number of continuous subarrays that sum to k.

Ex: Given the following nums and k…

nums = [1,1,4], k = 5, return 1.
Ex: Given the following nums and k…

nums = [3, 2, 2, 1, 1, 1], k = 5, return 3.

Time Complexity: O(n) where n is the len of array.
Space Complexity: O(n) Hash map cumulative number of item in map.

 */

public class ContinuousSums {
    public static int subArraySum(int[] nums, int k) {

        int count = 0;
        int cumulativeSum = 0;

        HashMap<Integer, Integer> sumFrequency = new HashMap<>();
        sumFrequency.put(0, 1);
        for (int num : nums) {
            cumulativeSum += num;

            if (sumFrequency.containsKey(cumulativeSum - k)) {
                count += sumFrequency.get(cumulativeSum - k);
            }

            sumFrequency.put(cumulativeSum, sumFrequency.getOrDefault(cumulativeSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 4};
        System.out.println(subArraySum(nums, 5));

        System.out.println(subArraySum(new int[]{3, 2, 2, 1, 1, 1}, 5));
    }
}
