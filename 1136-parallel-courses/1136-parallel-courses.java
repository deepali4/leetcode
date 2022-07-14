class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        
        int[] indegree = new int [n+1];
        int countSem = 0;
        int count = 0;
        List<List<Integer>> graph = new ArrayList<>();
        
        
        for(int i = 0 ; i < n+1 ; i++)  {
            graph.add(new ArrayList<>());
        }
        for(int[] rel : relations){
            graph.get(rel[0]).add(rel[1]);
            indegree[rel[1]] +=1;
        }
        
        
        Queue<Integer> q = new PriorityQueue<>();
        for(int i = 1 ; i < n+1 ; i++)  {
            
            if(indegree[i] == 0 )
                q.add(i);
        }
        
        
        
        
        while(!q.isEmpty()){
            Queue<Integer> q2 = new PriorityQueue<>();
            countSem++;
            
            for(int node : q){
                count++;
                for(int i : graph.get(node))
                {
                    indegree[i] -=1;
                    if(indegree[i]==0)
                    q2.add(i);
                }
            }
            q=q2;
        }
        
       return (count == n) ? countSem : -1;
    }
}