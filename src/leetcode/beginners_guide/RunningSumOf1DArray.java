package leetcode.beginners_guide;

import java.util.Arrays;

/*
1480. Running Sum of 1D Array (Easy)
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
*/
public class RunningSumOf1DArray {
    // first algorithm
    public static int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            results[i] = results[i - 1] + nums[i];
        }
        return results;
    }

    // second algorithm:
    public static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(runningSum(x)));
        System.out.println(Arrays.toString(runningSum2(x)));
    }
}