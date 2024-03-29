class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer ,Integer>map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i],1);
        }
        Set <Integer>set=new HashSet<>();
        for (Integer value : map.values()) {
            if(set.contains(value)) return false;
            else
                set.add(value);
            
        }
        return true;
    }
}