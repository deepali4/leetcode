class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=0;
        int last=nums.length-1;
        while(first<=last)
        {
            if(nums[first]==target && nums[last]==target)
                return new int[]{first,last};
            if(nums[first]!=target)first++;
            if(nums[last]!=target)last--;
            
        }
        return  new int[]{-1,-1};
    }
}