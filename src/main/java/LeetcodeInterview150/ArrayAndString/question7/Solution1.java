package LeetcodeInterview150.ArrayAndString.question7;

/** 121. 买卖股票的最佳时机
 *  使用dp的方式实现，时间复杂度为 O(n)
 */
public class Solution1 {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=0){
            return 0;
        }

        int maxProfit = 0;//记录从初始位置到当前的最大收益
        int minPrice = prices[0];//记录从初始位置到当前的最低价

        for (int i = 1; i < prices.length ; i++) {
            if(prices[i] < minPrice){
                //若当前价格比之前的历史最低价小，那么当前肯定是不能卖股票（亏），更新历史最低价
                minPrice = prices[i];
            }else{
                //当前价格大于之前历史最低价，看一下当前卖股票的收益是否大于之前所有节点计算的 maxProfit，是的话，就更新 maxProfit
                if(prices[i]-minPrice > maxProfit){
                    maxProfit = prices[i]-minPrice;
                }
            }
        }
        return maxProfit;
    }
}
