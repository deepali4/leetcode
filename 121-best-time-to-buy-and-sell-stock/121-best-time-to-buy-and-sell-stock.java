class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0];
        
        for(int i =0; i< prices.length ;i++){
            profit=Math.max(profit,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}

//Stock Buy and Sell
//- BF = use 2 for loops for each pair and continue
//- go left to right keep overwriting the lowest prices and as you go computer max diff/profit and keep overwriting

// keep updating lowest price  from left to right ..
// keep updating max profit --- profit is current price [] selling price - min buying price
