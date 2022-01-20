​class Solution {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxCount = 0, element = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxCount < entry.getValue()) {
                element = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return element;
    }
}
