class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        sol.add(firstRow);
        
        for(int i =1 ;i<numRows;i++){
            List<Integer> CurrentRow=new ArrayList<>();
            List<Integer> preRow=sol.get(i-1);
            CurrentRow.add(1);
            for(int j=1;j<i;j++)
                CurrentRow.add(preRow.get(j)+preRow.get(j-1));
            CurrentRow.add(1);
            sol.add(CurrentRow);
            
        }
        return sol;
    }
}