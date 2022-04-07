class Solution {
    public int lastStoneWeight(int[] stones) {
        int ans=0;
        if(stones.length==1)
            return stones[0];
        
        Arrays.sort(stones);
        int  i = stones.length-2;
        while(i>=0){
                stones[i]=stones[i+1]-stones[i];
                ans= stones[i];
                Arrays.sort(stones);
                i--;
        }
        return  ans;
        
    }
}