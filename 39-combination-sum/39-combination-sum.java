class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> sol = new ArrayList<>();
        helper(0,candidates,target,sol,new ArrayList<>());
        return sol;
    }
    
    public void helper(int idx , int[] candidates, int target , List<List<Integer>> sol,List<Integer> temp){
        if(target==0){
            sol.add(new ArrayList<>(temp));
            return;
        }
          
        if(idx==candidates.length || target<0)
            return;
        
        temp.add(candidates[idx]);
        helper(idx,candidates,target-candidates[idx],sol, temp);
        temp.remove(temp.size()-1);
        helper(idx+1,candidates,target,sol, temp);
        
    }
}