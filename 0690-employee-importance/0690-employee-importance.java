/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    int ans = 0;
    Map<Integer , Employee > map ;
    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        
        for(Employee e : employees) map.put(e.id,e);
        dfs(id);
        return ans;
    }
    
    public void dfs(int id){
        Employee e = map.get(id);
        
        ans += e.importance;
        
        for(int sub : e.subordinates)
            dfs(sub);
        
        return ;
    }
}