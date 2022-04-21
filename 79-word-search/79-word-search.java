class Solution {
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        
        for(int i =0 ; i< row ;i++)
        {
            for(int j=0;j<col;j++){
                if(word.charAt(0)== board[i][j] && helper(i,j,board,word,0))
                    return true;
            }
        }
        return false;
    }
    
    public boolean helper(int i , int j ,char[][]board,String word, int pos){
        if(pos==word.length())return true;
        if(i<0||j<0||i>=board.length|| j>=board[0].length)return false;
        if(word.charAt(pos)!=board[i][j]) return false;
        char temp =board[i][j];
        board[i][j]='*';
        if(helper(i+1,j,board,word,pos+1) || 
           helper(i,j+1,board,word,pos+1) || 
           helper(i-1,j,board,word,pos+1) || 
           helper(i,j-1,board,word,pos+1) )
            return true;
        board[i][j]=temp;
        
        return false;
    }
}