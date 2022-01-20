​class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums)
        {
            if(!map.isEmpty())
            {
               if(map.containsKey(i)){
                   map.put(i,map.get(i)+1);
               }
                else
                    map.put(i,1);
            }
            else
                map.put(i,1);
        }
        int ans=0;
         for (Integer key : map.keySet()){
          if(map.get(key)==1) ans=key;
      }
        return ans;
    }
}
