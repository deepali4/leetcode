class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
    
        left[0] = height[0];
        right[n-1] = height[n-1];
        int ans =0 ;
        
        for(int i = 1 ;i <n ; i++)
        {
            left[i] = Math.max(height[i], left[i-1]);
        }
        
        for(int i = n-2;  i>= 0 ; i--)
        {
            right[i] = Math.max(height[i], right[i+1]);
        }
        
        
        for(int  i = 0 ;i <n ; i++)
        {
            ans += Math.min(left[i], right[i])- height[i];
        }
        return ans;
    }
}