class Solution {
    public int majorityElement(int[] nums) {
       int majorityCount=nums.length/2;
       for(int i: nums){
           int count=0;
           for(int el : nums)
           {
               if(el==i)
                   count++;
           }
           if(count>majorityCount)
               return i;
       }
        
        return -1;
    }
}​
