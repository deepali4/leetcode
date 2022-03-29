class Solution {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;
        int count=0;
        
    
        boolean [] num= new boolean[n];
        
        
        for(int i =2 ; i*i < n ;i ++)
        {
            if(num[i]==false){
            for(int j =i*i;j<n;j+=i)                
                num[j]= true;
            }
        }
        
        
        for(int i =2 ;i<n; i++)
        {
            if(num[i]==false)
            {
                count+=1;
            }
        }
        
        return count;
       
    }
}