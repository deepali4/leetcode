class Solution {
    public void sortColors(int[] nums) {
        
        int zeroes=0;
        int ones=0;
        int twoes=0;
        
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zeroes++;
            if(nums[i]==1)
                ones++;
            if(nums[i]==2)twoes++;
        }
        int counter=0;
        
        while(zeroes>0){
            nums[counter++]=0;
            zeroes--;
        }
        while(ones>0){
            nums[counter++]=1;
            ones--;
        }
        while(twoes>0){
            nums[counter++]=2;
            twoes--;
        }
        
    }
}