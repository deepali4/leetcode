class Solution {
    public int jump(int[] nums) {
        
        int steps=0;
        int maxReach=0;
        int prevMaxReach=0;
        
        for(int i =0;i<nums.length-1;i++){
            maxReach=Math.max(maxReach,i+nums[i]);
            if(i==prevMaxReach)
            {
                steps++;
                prevMaxReach=maxReach;
            }
        }
        
        
        return steps;                     
        
    }
}