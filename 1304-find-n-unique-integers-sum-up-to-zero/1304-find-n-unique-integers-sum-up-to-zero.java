class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n == 0)
             return new int[]{0};
        
        if(n %2==0){
            int x = -( n /2  );
            
            for(int i =0 ; i < n ; i++)
            {
                if (x == 0 ) x++;
               ans[i] = x;
                x++;
               
            }
        }
        else {
            int x = -( n /2  );
            for(int i =0 ; i < n ; i++)
            {
                ans[i] = x;
                x++;
            }
        }
        
        return ans;
    }
}