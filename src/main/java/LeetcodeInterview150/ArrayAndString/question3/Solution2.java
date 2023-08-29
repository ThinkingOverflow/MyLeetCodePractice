package LeetcodeInterview150.ArrayAndString.question3;

/**
 * 按questuion4的普适解法来解
 */
public class Solution2 {
    public int removeDuplicates(int[] nums) {
        if(nums==null){
            return 0;
        }

        if(nums.length<=1) {
            return nums.length;
        }

        int left = 1;
        int right = 1;
        while (right<nums.length){
            if(nums[left-1] != nums[right]){
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
