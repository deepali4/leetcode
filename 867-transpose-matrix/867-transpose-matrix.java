class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int col = matrix[0].length;
        int row = matrix.length;
        int[][] tras = new int[col][row];
        
        for(int i  = 0 ;i <row ; i++)
        {
            for(int  j = 0;j<col ;j++){
                
                tras[j][i]=matrix[i][j];
            }
        }
        
        return tras;
    }
}