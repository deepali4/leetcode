class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        
        int col = grid[0].length;
        int row = grid.length;
        
        if(row== 0 )
            return 0;
        
        for(int i =0;i<row;i++)
        {
            for(int j =0 ;j<col;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;// new iland found
                    dfs(i,j,row,col,grid);
                }

            }            
        }
        return count;
    }
    
    public void dfs(int i , int j , int row , int col ,char[][] grid)
    {
        // boundary condition and if current is waterbody
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != '1') 
            return;
        
        grid[i][j]='2';
        
        dfs(i+1,j,row,col,grid);
        dfs(i-1,j,row,col,grid);
        dfs(i,j+1,row,col,grid);
        dfs(i,j-1,row,col,grid);
        
        
    }
}