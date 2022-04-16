class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        helper(nums,target,0,0);
        
        return count;
    }
    public void helper(int[] nums, int target,int curSum , int i )
    {
       
        if(i == nums.length){
            if(curSum==target)
                count++;
            return ;
        }
        else{
            helper(nums,target,curSum+nums[i],i+1);
            helper(nums,target,curSum-nums[i],i+1);
            
        }
    }
}