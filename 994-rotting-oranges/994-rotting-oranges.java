class Pair {
    
    int x;
    int y;
    Pair(int x , int y)
    {
        this.x = x ;
        this.y= y;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        int freshOrg =0;
       
        Queue<Pair> q = new LinkedList<>();
        
        for(int i = 0 ; i < row ; i++)
        {
            for(int j=0;j<col ;j++){
                if(grid[i][j]==2)
                    q.add(new Pair(i,j));
                else if(grid[i][j]==1)
                    freshOrg++;
            }
        }
        int mits=-1;
        if(freshOrg==0) return 0;
        while(!q.isEmpty())
        {
            int  newRottenOrranges = q.size();
            while(newRottenOrranges>0){
                Pair curOrg = q.poll();
                int x = curOrg.x;
                int y = curOrg.y;
                freshOrg = rottingorange(x,y,row,col,q,grid,freshOrg);
                newRottenOrranges--;
            }
           mits++;
        }
        if(freshOrg!=0) return -1;
        return mits;
    }
        
    public int rottingorange(int x ,int y ,int row , int col , Queue<Pair> q,int[][] grid ,int freshOrg)
    {
        //up
        
        if((x-1)>=0 && grid[x-1][y] == 1){
            
            grid[x-1][y] = 2 ;
        
            // mark as rottan
            //addto queie
            q.add(new Pair(x-1,y));
            // decrese number of fresh oranges
            freshOrg--;
            
        }
        
        //down
        if(x+1<row && grid[x+1][y]==1){
            
            grid[x+1][y] =2;
            q.add(new Pair(x+1,y));
            freshOrg--;
        }
        
        
        
        //left
        if(y-1 >=0 && grid[x][y-1] ==1 ){
            grid[x][y-1] =2;
            q.add(new Pair(x,y-1));
            freshOrg--;
        }
            
        //right
        if(y+1<col && grid[x][y+1]==1){
            grid[x][y+1] =2;
            q.add(new Pair(x,y+1));
            freshOrg--;
        }
        return freshOrg;
    }
}