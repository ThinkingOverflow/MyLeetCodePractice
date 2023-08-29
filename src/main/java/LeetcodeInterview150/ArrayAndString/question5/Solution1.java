package LeetcodeInterview150.ArrayAndString.question5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 计数法，时间复杂度 O(n)，空间复杂度 O(n)
 */
public class Solution1 {
    public int majorityElement(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int limit = nums.length >> 1;
        for (Integer key : map.keySet()) {
            if(map.get(key) > limit){
                return key;
            }
        }
        return -1;
    }
}
