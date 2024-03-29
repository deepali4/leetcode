class TwoSum {

    HashMap<Integer,Integer> map;
    public TwoSum() {
         map = new HashMap<>();
    }
    
    public void add(int number) {
        map.put(number,map.getOrDefault(number,0)+1);
    }
    
    public boolean find(int value) {
        for(Integer key : map.keySet()){
            int complement = value - key;
            if(complement != key){
                if(map.containsKey(complement)) return true;
            }
            else if(map.get(key)>1)
                return true;
        }
        
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */