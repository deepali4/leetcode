class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      
        if(nums2.length<nums1.length)
           return findMedianSortedArrays(nums2,nums1);
        
        
        int  m= nums1.length;
        int  n= nums2.length;
        int low=0;
        int high=nums1.length;
        int midianPos=(m+n+1)/2;  // m +n +1 here +1 take care of even length
        while(low<=high)
        {
            
            int cut1=(high+low)/2;
            int cut2=midianPos-cut1;
            
            int l1=(cut1==0)?Integer.MIN_VALUE:nums1[cut1-1];
            int l2=(cut2==0)?Integer.MIN_VALUE:nums2[cut2-1];
            int r1=(cut1==m)?Integer.MAX_VALUE:nums1[cut1];
            int r2=(cut2==n)?Integer.MAX_VALUE:nums2[cut2];
            
                
            if(l1<=r2 && l2<=r1)
            {   if((m+n)%2!=0) // if total length is odd
                return Math.max(l1,l2);
                else
                    return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
            }
            // move the binary search to left 
            else if(l1>r2)
                high=cut1-1; 
            // move the binary search to right
            else
                low=cut1+1;
            
        }
        
        
        return 0.0;
         
    }
}