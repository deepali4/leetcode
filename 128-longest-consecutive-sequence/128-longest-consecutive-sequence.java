class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i : nums){
            set.add(i);
        }
        int sol=0;
        
        
        for(int i : set){
            
            if(!set.contains(i-1)){
                int currentnum=i;
                int counter=1;
                
                while(set.contains(currentnum+1))
                    {currentnum++;counter++;
                    }
                sol= Math.max(sol,counter);
            }
            
            
        }
        
        return sol;
        
    }
}