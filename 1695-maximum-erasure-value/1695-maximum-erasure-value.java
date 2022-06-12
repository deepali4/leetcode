class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        Set<Integer> set  = new HashSet<>();
        int left =0 ;
        int right =0;
        int cursum=0;
        int maxsum = Integer.MIN_VALUE;
        while(right<nums.length){
            
            if(!set.contains(nums[right]))
            {
                set.add(nums[right]);
                cursum+=nums[right];
                maxsum= Math.max(cursum,maxsum);
                right++;
            }else
            {
                cursum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            
        }
    
       return maxsum;
        
    }
}