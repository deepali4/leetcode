class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        List<List<Integer>> adjList = new ArrayList<>();
        
        for(int i = 0 ; i < n; i++  )
        {
            adjList.add(new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
             adjList.get(edge[0]).add(edge[1]);
             adjList.get(edge[1]).add(edge[0]);
        }
        
        
        
        int[] visited = new int[n];
        dfs(0,adjList,visited);
        for(int i  = 0 ; i< n ; i++ ){
            if(visited[i]==0) return false;
        }
        return edges.length  == n-1;
    }
                   
                   
    public void dfs(int  node  , List<List<Integer>> adjList ,  int[] visited  ){
        if(visited[node] == 1 ) return;
        visited[node] = 1 ; 
        List<Integer> adjNodeList = adjList.get(node);
        for(int i : adjNodeList ){
                dfs(i,adjList,visited);
        }
    }
}