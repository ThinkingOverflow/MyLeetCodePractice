package LeetcodeInterview150.ArrayAndString.question5;

import java.util.Arrays;

/**
 * 排序法，时间复杂度 O(nlogn)，空间复杂度 O(logn)
 */
public class Solution2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }
}
