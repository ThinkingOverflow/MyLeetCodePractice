package LeetcodeInterview150.ArrayAndString.question6;

/** 189. 轮转数组
 * 三次reverse的方法，可以直接在原地反转，不需要多余的空间。
 */
public class Solution1 {
    public void rotate(int[] nums, int k) {
        if (nums==null || nums.length==0){
            return;
        }
        //如果k>nums.length，那么需要取模将k取到nums.length范围之内
        if(k>nums.length){
           k %= nums.length;
        }

        reverse(nums , 0 , nums.length-1);
        reverse(nums  ,0 ,k-1);
        reverse(nums , k , nums.length-1);
    }

    public void reverse(int[] arr , int start , int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
