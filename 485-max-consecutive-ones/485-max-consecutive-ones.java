class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int curcount=0;
        
        for(int i =0 ;i < nums.length;i++)
        {
            if(nums[i]==1)
            {   
                curcount+=1;
                 max=Math.max(max,curcount);
            }
            else
            {
               
                curcount=0;
            }
              
        }
        
        return max;
        
    }
}