class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int count=0;
        int i = 0;
        int j = plants.length-1;
        int currA = capacityA;
        int currB = capacityB;
        while(i<=j){
            
            if(i==j){
               if (plants[i] > currA &&  plants[i] > currB) count++;
                break;
            }
            
            if(plants[i]>currA){
                
                currA=capacityA;
                count++;
            }
            if(plants[j]>currB){
                
                currB=capacityB;
                count++;
            }
            
            
            currA-=plants[i];
            currB-=plants[j];
            
            i++;
            j--;
            
        }
        
        
        
        
        return count;
    }
}