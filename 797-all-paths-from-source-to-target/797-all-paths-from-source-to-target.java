
class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(graph, 0,graph.length-1,new ArrayList<>());
        return res;
    }
    public void dfs(int[][] graph,int source, int destination,List<Integer> list)
    {
        list.add(source);
        if(source == destination){
            res.add(list); return;
        }
            
        
        for(int  neg : graph[source]){
             dfs(graph, neg,destination,new ArrayList<>(list));
        }
    }
}