class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxsum=0;
        int row   = grid.length;
        int col   = grid[0].length;
                
        for(int i =0 ; i<row ; i++){
            for(int  j =0 ;j<col ;j++){
                
                if(grid[i][j]==1){
                    int sum=  dfs(grid,row,col,i,j);
                    maxsum = Math.max(sum , maxsum);
                }
            }
        }        
        return maxsum;
    }
    public int dfs(int[][] grid , int row ,int col, int i , int j )
    {
        if(i<0 || j< 0 || i>= row || j >= col || grid[i][j]!=1) return 0;
        
        grid[i][j] = 0;
        
        return (
            1+ dfs(grid,row,col,i+1,j)+
             dfs(grid,row,col,i,j+1)+
             dfs(grid,row,col,i-1,j)+
            dfs(grid,row,col,i,j-1)
        );
        
    }
}