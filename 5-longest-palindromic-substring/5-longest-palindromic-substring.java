class Solution {
    int maxlen=0;
    int start=0;
    
    public String longestPalindrome(String s) {
        if(s.length()<2)
            return s ;
        
        for(int i = 0; i< s.length()-1;i++)
        {
            expand(s,i,i);
            expand(s,i,i+1);
        }
        
        return s.substring(start,start+maxlen);
    
    }
    
    public void expand(String s, int i ,int j )
    {
        
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        
        if(maxlen < (j-i-1))
        { 
            start=i+1;
            maxlen=(j-i-1);
            
        }
    }
}