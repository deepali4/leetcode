​class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // we can only have maximum 2 majority elements
        int count1=0;
        int count2=0;
        Integer candidate1 = null;
        Integer candidate2 = null;
        
      
       // step 1. find out those 2 majority elements
       // using Moore majority voting algorithm
        
        for(int i : nums){
            if(candidate1!=null && i == candidate1) {
                count1++;
            }
            else if(candidate2!=null && i == candidate2) {
                count2++; 
            }
            else if(count1==0) {
                candidate1=i;count1++;
            }
            else if(count2==0) {
                candidate2=i;count2++;
            }
            else  { 
                count1--; count2--;
            }
        }
        
      
      // pass 2 to double check
      // The first round only elects two most frequent numbers as candidates; there is no guarantee that the candidates appear more than N/3 times.
      // Try out this example: [1,1,1,2,3,3] where 1 and 3 are both candidates but only 1 appears more than N/3=2 times.
         count1=0;
         count2=0;
        for(int i : nums)
        {
            if(candidate1!=null && i == candidate1) count1++; 
            if(candidate2!=null && i == candidate2) count2++; 
        }
        
        
       List<Integer> ans= new ArrayList<>();
        int n =nums.length;
        if(count1> n/3) ans.add(candidate1);
        if(count2> n/3) ans.add(candidate2);
        
      
       return ans;
        
    }
}
