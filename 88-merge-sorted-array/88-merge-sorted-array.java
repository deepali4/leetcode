class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // using three pointers  setting pointers to last
        
        int ptr1=m-1;  // -- to traverse num1 
        int ptr2=n-1;  // -- to traverse num2
        int i = m+n-1; // -- Filling the elements from last
        
        while(ptr2>=0)
        {
            if(ptr1>=0 && nums1[ptr1]>nums2[ptr2]){
                nums1[i]=nums1[ptr1];
                i--;
                ptr1--;
            }
            else
            {
                nums1[i]=nums2[ptr2];
                i--;
                ptr2--;
            }
            
        }
        
    }
}