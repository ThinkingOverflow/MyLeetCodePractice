package LeetcodeInterview150.ArrayAndString.question1;

/**
 * 88. 合并两个有序数组
 * 从后往前判断，将大的数逐渐放到相应的位置
 */
public class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2==null || n==0){
            return;
        }

        int totalLength = nums1.length;

        //当 num2 还有元素没有移动到 num1 中时，继续操作
        while (n > 0){
            //此处m也得大于0，即num1还有元素没有比较，否则直接将nums2所有的元素逐个放到num1里面
            if(m>0 && nums1[m-1] >= nums2[n-1]){
                swap(nums1 , --totalLength , nums1 , --m);
            }else{
                swap(nums1 , --totalLength , nums2 , --n);
            }
        }
    }

    /**
     * 此处需要注意，交换的是2个不同的数组
     * @param arr1
     * @param i
     * @param arr2
     * @param j
     */
    private void swap(int[] arr1 , int i , int arr2[] , int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println("多吃蔬菜VS额地方v从三大包");
    }
}
