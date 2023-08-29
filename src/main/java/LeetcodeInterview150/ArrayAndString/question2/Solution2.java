package LeetcodeInterview150.ArrayAndString.question2;

/**
 * 27. 移除元素
 * 双指针，头尾指针，类似于快排
 */
public class Solution2 {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length==0){
            return 0;
        }

        int left = 0;
        int right = nums.length-1;

        while (left<right){
            if(nums[left] == val){
                nums[left] = nums[right];
                right--;
            }else{
                left++;
            }
        }

        return nums[left]==val ? left : left+1;
    }
}
