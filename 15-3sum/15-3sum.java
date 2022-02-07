class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        
        Arrays.sort(nums);
        // --  if current valu > 0 it won't give sum as 0
        for(int i =0 ;i <nums.length && nums[i]<=0; i++){
            
            //-- If the current value is the same as the one before, skip it.
            if( i == 0 || nums[i-1]!=nums[i] )
            {  
                twoSum(nums,i,ans);
             }
        }
        return ans;
    }
    
    public void twoSum (int[]  nums , int i ,List<List<Integer>> ans)
    {
       
        int lo = i+1;
        int hi = nums.length-1;
        
        
        while(lo < hi ){
            
            int sum = nums[i]+nums[lo]+nums[hi];
            
            if(sum<0)
            {
                lo++;
            }
            else if(sum >0 )
            {
                hi--;
            }
            else{
                ans.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                // -- Increment lo while the next value is the same as before to avoid                               duplicates in the result.
                while(lo<hi && nums[lo]==nums[lo-1])
                    lo++;
                
                
            }
            
            
            
        }
        
    }
}