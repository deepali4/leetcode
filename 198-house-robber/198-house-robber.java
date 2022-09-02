class Solution {
    HashMap<Integer ,Integer > memo = new HashMap<>();
    public int rob(int[] nums) {
        
        return dp(nums.length-1,nums);
        
    }
    
        
    private int dp(int i,int[] nums) {
        // Base cases
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);
        if (!memo.containsKey(i)) {
            memo.put(i, Math.max(dp(i - 1,nums), dp(i - 2,nums) + nums[i])); // Recurrence relation
        }
        return memo.get(i);
    }
        
    
}