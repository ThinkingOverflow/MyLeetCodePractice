package LeetcodeInterview150.ArrayAndString.question2;

/**
 * 27. 移除元素
 * 双指针都在头部的解法
 */
public class Solution1 {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0){
            return 0;
        }

        int left = 0;
        int right = 0;

        while (right<nums.length){
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
