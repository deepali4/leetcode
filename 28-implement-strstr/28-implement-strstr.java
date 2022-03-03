class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() == 0)
            return 0;
        int lps[] = computeKMPtable(needle);
        int n = haystack.length();
        int m = needle.length();
        
        int  i= 0; 
        int j =0;
        
        while(i<n)
        {
            if(haystack.charAt(i) == needle.charAt(j)){
                ++i;
                ++j;
                
                
                if(j==m)
                    return i-m;
            }
            else if(j!=0)
                j=lps[j-1];
            else
                i++;
            
        }
        
        return -1;
    }
    
    public int[]  computeKMPtable(String needle){
        
        int j= 0; 
        int i=1;
         int arr[] = new int[needle.length()];
        while(i<needle.length())
        {
            if(needle.charAt(i)==needle.charAt(j))
            {
                arr[i++]=++j;
              
            }
            else if(j!=0)
                j=arr[j-1];
            else
                i++;
            
        }
        
        return arr;
        
    }
}