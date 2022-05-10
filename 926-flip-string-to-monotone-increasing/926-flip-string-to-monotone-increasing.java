class Solution {
    public int minFlipsMonoIncr(String s) {
        
        int flip=0;
        int ones=0;
        for(int i =0 ;i < s.length() ;i++)
        {
            if(s.charAt(i)=='1')
                ones++;
            else
                flip++;
            
            flip=Math.min(ones,flip);
                
        }
        return flip;
        
    }
}