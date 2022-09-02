class Solution {
    HashMap<Integer, Integer > map = new HashMap<>();

    public int climbStairs(int n) {
        
        return dp(n);
        
    }
    public int dp(int n ){
        
        if (n <= 2) return n;
        
        if(!map.containsKey(n))
            map.put(n , dp(n-1) + dp(n-2));
        
            
        return map.get(n);
    }
}