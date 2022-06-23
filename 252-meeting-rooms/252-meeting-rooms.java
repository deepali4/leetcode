class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> (a[0]-b[0]));
         LinkedList<int[]> ans =new LinkedList<>();
        
        for(int[] interval :  intervals){
            
            if(ans.isEmpty() || ans.getLast()[1] <= interval[0] )
                ans.add(interval);
            else{
                
                return false;
            }
            
        }
        return true;
        
    }
}