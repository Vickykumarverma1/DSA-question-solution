class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestbuy = prices[0];
        int n = prices.length;
        for(int i = 0; i<n; i++)
        {
            if(prices[i]>bestbuy)
            {
                maxProfit = Math.max(maxProfit , prices[i] - bestbuy);
            }
            bestbuy = Math.min(bestbuy,prices[i]);
        }
        return maxProfit;
    }
}