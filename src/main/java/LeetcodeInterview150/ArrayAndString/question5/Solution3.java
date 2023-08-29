package LeetcodeInterview150.ArrayAndString.question5;

/**
 * 排序法，时间复杂度 O(n)，空间复杂度 O(1)
 * 这种写法严格控制了元素的个数，因此在 nums[i]!=curNum 的时候判断比较复杂。
 * 其实 target 一定是多数的，那其实当 count=0 的时候，直接把 curNum 设置为当前的 nums[i] 并设置 count=1 即可，
 * 虽然次数 nums[i] 实际个数为0，但是将其设置为1个，最后 target 的个数一定比半数大，如果 nums[i] 不是 target，它最后也会被 target 消除
 */
public class Solution3 {
    public int majorityElement(int[] nums) {
        int curNum = nums[0];
        int count = 1;
        int limit = nums.length >> 1;
        for (int i = 1; i < nums.length; i++) {
            if(count > limit){
                return curNum;
            }
            if(nums[i]==curNum){
                count++;
            }else{
                if(count==0){
                    curNum = nums[i];
                    count++;
                }else{
                    count--;
                    if(count==0){
                        //需要更新 curNum，避免出现 [3,2,3] 的情况
                        curNum = nums[i];
                    }
                }
            }
        }
        return curNum;
    }

    public int majorityElement2(int[] nums){
        int curNum = nums[0];
        int count = 1;
        int limit = nums.length >> 1;
        for (int i = 1; i < nums.length; i++){
            if(count > limit){
                return curNum;
            }
            if(nums[i]==curNum){
                count++;
            }else if(--count == 0){
                curNum = nums[i];
                count = 1;
            }
        }
        return curNum;
    }
}
