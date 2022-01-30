class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Arrays.sort(intervals, (a, b) -> (a[0]-b[0]))
        //  Collections.sort(intervals, (a, b) - > a.get(0) - b.get(0));
        // Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        LinkedList<int[]> ans =new LinkedList<>();
         
        for(int[] interval : intervals)
        {
             // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if(ans.isEmpty() || ans.getLast()[1] < interval[0] )
                ans.add(interval);
             // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else{
                
                ans.getLast()[1]=Math.max(ans.getLast()[1],interval[1]);
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}
