class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int [] colour = new int[graph.length];
        Arrays.fill(colour,-1);

        
        for(int i =0;i<graph.length;i++)
        {
            if(colour[i] ==-1)
            {
                if(!dfs(i,graph,colour))
                    return false;
            }
        }
        
        return true;        
    }
    
    public boolean dfs ( int node , int [][] graph, int[] colour)
    {
        
        if(colour[node]==-1) colour[node]=1;
        
        // check for adj nodes
        for(int adj : graph[node])
        {
            // if node is not coloured
            
            if(colour[adj]==-1)
            {
                colour[adj]=1 - colour[node];
                
                if(!dfs(adj,graph,colour))
                    return false;
            }
            
            else if( colour[adj] == colour[node]){
                    return false;
            }
            
        }
        
        
        return true;
    }
}