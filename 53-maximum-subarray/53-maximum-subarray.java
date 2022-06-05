// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int maxSum=Integer.MIN_VALUE;
        
//         int currentSum=0;
        
//         for(int i =0;i<nums.length;i++)
//         {
//             currentSum=currentSum+nums[i];
//             maxSum= Math.max(maxSum,currentSum);
//             if(currentSum<0)
//                 currentSum=0;            
            
//         }
        
//         return maxSum;
        
//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int max =   Integer.MIN_VALUE;
        
        for(int i = 0 ; i<nums.length;i++){
            
            if(i>0 &&nums[i-1]>0){
                nums[i]+=nums[i-1];
            }
            max= Math.max(max,nums[i]);
        }
        
        return max;
    }
}