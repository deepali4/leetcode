class Solution {
    public boolean validPalindrome(String s) {
        
        
        int i=0;
        int j =s.length()-1;
        
        
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return isPalimdrome(s,i+1,j) || isPalimdrome(s,i,j-1);
            
            i++;
            j--;
        }    
        return true;
    }
    
    public boolean isPalimdrome(String s, int i , int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            
            i++;
            j--;
        }
        
        
        return true;
    }
}