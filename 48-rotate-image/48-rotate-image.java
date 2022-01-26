class Solution {
    public void rotate(int[][] matrix) {
        
        int col = matrix[0].length;
        int row = matrix.length;
        
        // TRANPOSE 
        
        for(int i =0; i < row ; i++)
        {
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Flip acloss col horizontally  
        
        for(int i =0; i < row ; i++)
        {
            for(int j=0;j<col/2;j++){
                int temp=matrix[i][j];
                matrix[i][j] = matrix[i][col-j-1];
                matrix[i][col-j-1] = temp;
            }
        }
        
    }
}