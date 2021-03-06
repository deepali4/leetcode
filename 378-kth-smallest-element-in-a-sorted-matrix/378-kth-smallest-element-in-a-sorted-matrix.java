class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1,n2) -> n2 - n1);
        int n =  matrix.length;
        
        
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                 pq.add(matrix[i][j]);
                if(pq.size()>k)
                    pq.poll();
             }
        }
//         while(k>1)
//         {
//             pq.poll();
//             k--;
//         }
             
    return pq.peek();
    }
}