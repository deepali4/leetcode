class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
         Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count=nums.length/3;
        List<Integer> sol = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>count) {
               sol.add(entry.getKey());
            }
        }
        return sol;
    }
}
