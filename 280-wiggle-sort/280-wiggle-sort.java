class Solution {
    public void wiggleSort(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i  = 1 ;i <nums.length-1 ; i=i+2){
         
            int temp =  nums[i];
            nums[i]= nums[i+1];
            nums[i+1]=temp;
        }
        
    }
}