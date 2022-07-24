class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n= points.length;
        int ans =0 ; 
        int edgedUsed = 0;
        
        boolean isMst[] = new boolean[n];
        
        int distance[] = new int[n];
        
        distance[0] = 0 ;
        
        
        for(int i  =1 ;i<n ;i++){
            distance[i] = Integer.MAX_VALUE;
        }
        
        while(edgedUsed<n){
            
            int min = Integer.MAX_VALUE;
            int curnode=-1;
            
            
            for(int i = 0 ; i< n ; i++){
                if(!isMst[i] && min > distance[i]){
                    curnode = i ;
                    min = distance[i];
                }
            }
        edgedUsed++;
        ans+=min;
        isMst[curnode] = true;
        
        // update adjeson nodes 
            
             for(int i = 0 ; i< n ; i++)
             {
                 int wight =  Math.abs(points[curnode][0] -points[i][0])
                 + Math.abs(points[curnode][1] -points[i][1]);
                 
                 if(!isMst[i] && wight < distance[i]){
                    distance[i] = wight;
                }
                 
                 
            }
    }
            
            return ans;
        }
        
        
    
}