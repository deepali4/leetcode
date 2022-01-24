class Solution {
    public void sortColors(int[] nums) {
        
        int low =0;
        int high=nums.length-1;
        int current=0;
        
         while(current<=high)
         {
            
                if(nums[current]==0)
                {
                    nums[current]=nums[low];
                    nums[low]=0;
                    low++;
                }
                if(nums[current]==2)
                {
                    nums[current]=nums[high];
                    nums[high]=2;
                    high--;
                    current--;
                }
             
             current++;
         }
    }
}

// add zeroes from front side .. add 2 from end side ;;

// travel through original array if zero found add to low point and and if 2 found add it to high pointer 
