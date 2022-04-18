class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0;
        int right=col-1;
        int top=0;
        int bottom=row-1;
        while(res.size()<row*col)
        {
            
            
            for(int i=left;i<=right;i++)
            {
                res.add(matrix[top][i]);
            }

            for(int i=top+1;i<=bottom;i++)
            {
                res.add(matrix[i][right]);
            }
            
            if(top!=bottom){
                for(int i=right-1;i>=left;i--){
                   res.add(matrix[bottom][i]);
              } 
            }
           if(right!=left){
                for(int i=bottom-1;i>top;i--)
                {
                    res.add(matrix[i][left]);
                }
            }            
            
            top++;
            bottom--;
            left++;
            right--;
            
        }
        
        
        return res;
        
    }
}