class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {        
        int[] visited = new int[rooms.size()];
        visited[0]=1;
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        
        while(!q.isEmpty()){
            int curroom = q.poll();
            
            for(int i : rooms.get(curroom)){
                if(visited[i]==0)
                {
                    visited[i]=1;
                    q.add(i);
                }
            }
                
            
        }
        
        
        for(int i :  visited)
            if(i==0)return false;
        
        return true;
        
    }
}