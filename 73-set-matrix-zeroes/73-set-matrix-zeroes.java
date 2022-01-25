class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        
        for(int i =0 ;i< row;i++)
        {
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        
         for(int i =0;i< row;i++)
        {
            for(int j=0;j<col;j++){
                if(setRow.contains(i) || setCol.contains(j) ){
                    matrix[i][j]=0;
                }
            }
        }
        
        
    }
}

// BF - If any cell of the matrix has a zero we can record its row and column number. 
// All the cells of this recorded row and column can be marked zero in the next iteration.

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        
        for(int i =0 ;i< row;i++)
        {
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        
         for(int i =0;i< row;i++)
        {
            for(int j=0;j<col;j++){
                if(setRow.contains(i) || setCol.contains(j) ){
                    matrix[i][j]=0;
                }
            }
        }
        
        
    }
}

// BF - If any cell of the matrix has a zero we can record its row and column number. 
// All the cells of this recorded row and column can be marked zero in the next iteration.
// Complexity Analysis

// Time Complexity: O(M \times N)O(M×N) where M and N are the number of rows and columns respectively.

// Space Complexity: O(M + N)O(M+N).
