class Solution {
    public void sortColors(int[] nums) {
        
        int low =0;
        int high=nums.length-1;
        int current=0;
        
         while(current<=high)
         {
             //if current is 0, swap with p1 pointer, increment p1
                if(nums[current]==0)
                {
                    nums[current]=nums[low];
                    nums[low]=0;
                    low++;
                }
               //if current is 2, swap with p2 pointer, decrement p2
                if(nums[current]==2)
                {
                    nums[current]=nums[high];
                    nums[high]=2;
                    high--;
                    
                    //may have swapped an extra 0 from the end of array that requires extra processing, so decrement index to account for it
                    current--;
                }
               //move to next index to make progress
             current++;
         }
    }
}

// add zeroes from front side .. add 2 from end side ;;

// travel through original array if zero found add to low point and and if 2 found add it to high pointer 
