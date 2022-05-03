class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] sol=new int[nums.length];
        int ptr1=0;
        int ptr2=nums.length-1;
        for(int val : nums){
            if(val%2==0)
                sol[ptr1++]=val;
            else
                sol[ptr2--]=val;
        }
        return sol;
    }
}