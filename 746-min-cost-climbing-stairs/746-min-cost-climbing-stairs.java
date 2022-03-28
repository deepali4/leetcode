class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        // FOR STEP 1 and 0 we can choose eighter 0 or 1 so the cost is  0 
        
        for(int i =2; i< cost.length;i++){
            
            cost[i]+=Math.min(cost[i-1],cost[i-2]);
                              
        }

          return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}