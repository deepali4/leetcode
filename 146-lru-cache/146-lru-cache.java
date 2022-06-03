class LRUCache {    
    
    HashMap<Integer , Integer> map;
    int Size;
    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer,Integer>();
        Size   = capacity;
        
    }
    
    public int get(int key) {
        
        if(map.containsKey(key))
        {
            int val =  map.remove(key);
            map.put(key,val);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key))
            map.remove(key);
        else if(map.size() == Size)
        {
            map.remove(map.keySet().iterator().next());
        }
        map.put(key,value);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */