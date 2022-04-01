class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 && n==1) return 1;
        
        int[][]dp = new int [m][n];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        
         countPath(0,0,m,n,dp);
        return dp[0][0];
      
    }
    public int countPath(int i , int j, int m ,int n ,int[][]dp)
    {
        if(i== (m-1) && j == (n-1)) return 1;
        if(i>=m || j >= n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        else return dp[i][j] =countPath(i+1,j,m,n,dp)+countPath(i,j+1,m,n,dp);
    }
}