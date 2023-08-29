package LeetcodeInterview150.ArrayAndString.question3;

/**
 * leetcode 26. 删除有序数组中的重复项
 */
public class Solution1 {
    public int removeDuplicates(int[] nums) {
        if(nums==null){
            return 0;
        }

        if(nums.length<=1) {
            return nums.length;
        }

        int left = 0;
        int right = 1;
        while (right<nums.length){
            if(nums[left] != nums[right]){
                //优化，如果right-left=1，那说明这次复制是没有必要的，因此不要复制，但是left右移
                if(right-left>1){
                    nums[left+1] = nums[right];
                }
                left++;
            }
            right++;
        }
        return left+1;
    }
}
