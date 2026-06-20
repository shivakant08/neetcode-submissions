class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i= 0;
        int j = 1;


        while(i < prices.length && j < prices.length){
            if (prices[i]< prices[j]){
                int curr = prices[j] - prices[i];
                profit = Math.max(profit, curr);
            }else{
                i= j;
            }
            j++;
        }
        return profit;

    }
}
