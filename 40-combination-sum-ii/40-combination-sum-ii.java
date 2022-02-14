class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
        List<List<Integer>> sol = new ArrayList<>();
        helper(0,candidates,target,sol,new ArrayList<>());
        return sol;
    }
    
    public void helper(int idx , int[] candidates, int target , List<List<Integer>>                 sol,List<Integer> temp){
        if(target==0){
            sol.add(new ArrayList<>(temp));
            return;
        }
       for(int i=idx;i<candidates.length;i++)
       {
           if(i>idx && candidates[i] ==  candidates[i-1]) continue;
           if(candidates[i]>target) break;
            temp.add(candidates[i]);
            helper(i+1,candidates,target-candidates[i],sol, temp);
            temp.remove(temp.size()-1);
          //  helper(idx+1,candidates,target-candidates[idx],sol, temp);
       }
        
    }
}