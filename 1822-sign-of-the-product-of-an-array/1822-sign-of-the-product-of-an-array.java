class Solution {
    public int arraySign(int[] nums) {
        
        
        int zero=0;
        int pos =0;
        int neg =0 ;
        for(int x : nums){
            
            if(x== 0)
                return 0;
            if(x>0)
                pos++;
            if(x<0)
                neg++;
        }
        
        if(neg % 2!=0) return -1;
        
        return 1;
    }
}