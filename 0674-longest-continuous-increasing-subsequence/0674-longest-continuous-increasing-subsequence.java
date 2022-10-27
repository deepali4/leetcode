class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cur = 0 ;
        int max = 0 ;
        
        for(int i =0;i< nums.length ; i++){
            if(i==0) cur++;
            
            else{
                if(nums[i]>nums[i-1])
                    cur++;
                else{
                    max= Math.max(cur,max);
                    cur=1;
                    
                }
                 
            }
         }
            
     return Math.max(max,cur);
        
    }
}