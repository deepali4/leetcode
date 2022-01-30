​class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow=nums[0];
        int fast=nums[0];
        
      // find the intersection point
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
            
        fast = nums[0];
        
      // move both slow and fast by one
        while(slow!=fast){
             slow=nums[slow];
            fast=nums[fast];
            
        }
        
        
        return fast;
        
        
    }
}
