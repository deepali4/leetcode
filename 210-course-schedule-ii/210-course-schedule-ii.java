class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];
        int[] inorder = new int[numCourses];
        int count = 0 ;
        Queue<Integer> queue = new PriorityQueue<Integer> ();  
        List<List<Integer>> courses = new ArrayList<List<Integer>>(numCourses);
        for(int i = 0 ; i < numCourses ; i++)
        {
            courses.add(new ArrayList<>());
        }
        for(int i = 0 ; i < prerequisites.length ; i++)
        {
            courses.get(prerequisites[i][1]).add(prerequisites[i][0]);
            inorder[prerequisites[i][0]] +=1;
        }
        for(int i = 0 ; i < numCourses ; i++){
            if(inorder[i] == 0 )
                queue.add(i);
        }
        
        int i= 0;
        while(!queue.isEmpty())
        {
            int cur = queue.poll();
            ans[i++] = cur;
            for(int adj : courses.get(cur) ){
                inorder[adj]-=1;
                if(inorder[adj] == 0 ) 
                    queue.add(adj);
            }
            count++;
        }
        
        
        if(count< numCourses) 
            return (new int[0]);
        else 
            return ans;
    }
}