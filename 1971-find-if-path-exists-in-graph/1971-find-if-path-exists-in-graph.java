class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Map<Integer , List<Integer> > map = new HashMap<>(); 
        for(int i =0 ;i < n ; i++){
            map.put(i,new ArrayList<>());
        }
        
        for(int i =0 ;i <edges.length ; i++ )
        {
            int a = edges[i][0];
            int b = edges[i][1];
            
            map.get(a).add(b);
            map.get(b).add(a);
        }
        
        int visited[] = new int[n];
        
         return  dfs( visited , map , source , destination);
        
        
    }
    
    public boolean dfs ( int[] visited , Map<Integer , List<Integer> > map ,  int source, int destination  )
    {
        if(visited[source] == 1 ) return false;
        if(source == destination) return true;
        visited[source] = 1;
        
        for( Integer neig : map.get(source))
        if(dfs(visited, map ,neig , destination)) return true;
        
        
        return false;
        
    }
    
}