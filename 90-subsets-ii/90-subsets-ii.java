class Solution {
    
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,0,result,new ArrayList<>());
        return result;
    }
    
    public void helper(int[] nums , int idx ,List<List<Integer>> result,List<Integer> temp)
    {
        // base condition  if idx == length of the original array
      result.add(new ArrayList<>(temp));
         
        for(int  i = idx ;i<nums.length;i++){
            if(i!=idx && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            helper(nums,i+1,result,temp);
            temp.remove(temp.size()-1);
           
        }
    }
}