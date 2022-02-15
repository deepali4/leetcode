class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,ans);
        return ans;
    }
    public void helper(int i , int[] nums ,  List<List<Integer>> ans )
    {
        if(i== nums.length)
        {   List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                list.add(nums[j]);
            }
            ans.add(list);
            return;
        }
        
        for(int idx =i;idx<nums.length;idx++)
        {
            swap(idx,i,nums);
            helper(i+1,nums,ans);
            swap(idx,i,nums);
        }
    }
    public void swap(int i , int j , int [] nums)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}