class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ptr1 = 0;
        int ptr2 = n;
        int[] outputarray = new int[2*n];
        
       int  i =0 ;
        
        while(ptr1<n || ptr2<2*n)
        {
            if(i%2 == 0){
                outputarray[i] = nums[ptr1];
                ptr1++;
            }
            else{
                 outputarray[i] = nums[ptr2];
                ptr2++;
            }
            i++;
        }
        
        
        
        return outputarray;
        
    }
}