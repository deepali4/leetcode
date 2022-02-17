class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length==1)
        return nums[0];
        
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])
            return nums[nums.length-1];
        int low=0;
        int high=nums.length;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            // check if middle is sigle element
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]&&mid>0)
                return nums[mid];
            // -- check if 1st occerance is at even position and 2nd occarance is at odd position the search 
            // right part of the array .. 
            // if single element is at left then 1 st occarance will be at odd position
            if((nums[mid-1]==nums[mid] && (mid-1)%2==0 )|| (nums[mid+1]==nums[mid] && (mid+1)%2!=0) )
               low=mid+1;
            else
               high=mid-1;
            
        }
        return nums[low];
    }
}