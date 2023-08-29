package LeetcodeInterview150.ArrayAndString.question4;

/**
 * 80. 删除有序数组中的重复项 II
 * 思路可以拓展到 k 个
 */
public class Solution1 {
    public int removeDuplicates(int[] nums) {
        if(nums==null){
            return 0;
        }
        if(nums.length<=2){
            return nums.length;
        }

        int left = 2;
        int right = 2;

        /**
         * 其实这里的道理很简单，left就是当前要放元素的位置，right就是当前想拿出来放的元素的位置，且数组是递增的，
         * 如果 left-2 位置的元素等于 right，说明 left-2到 right位置的元素系统，右移right直到找到不同元素的位置，
         * 此时将 nums[left]=nums[right]，left++表示真实数组位置向右移动，right++右移表示之前继续旋转下一个可能可以放的元素。
         * 我们只考虑 left 左边的元素是否超过2个，并将right及其右边的元素拿出来比较并存放到left位置，而left-right位置的元素不需要考虑。
         * 因此只要比较 nums[left-2] 与 nums[right] 是否相等即可。
         */
        while (right<nums.length){
            if(nums[left-2] != nums[right]){
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
