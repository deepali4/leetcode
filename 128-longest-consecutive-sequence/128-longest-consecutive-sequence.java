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
// logic
// use set lokup fuction
// for num  in set dont check for num-1 as it might bot be start of seq
// if num-1 not present count num+1 using counter and change num to num +1;
// update max count so far to sol
