class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,0,result,new ArrayList<>());
        return result;
    }
    
    public void helper(int[] nums , int idx ,List<List<Integer>> result,List<Integer> temp)
    {
        // base condition  if idx == length of the original array
        if(idx == nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[idx]);
        helper(nums,idx+1,result,temp);
        
        temp.remove(temp.size()-1);
        helper(nums,idx+1,result,temp);
        
        
        
    }
    
}