class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>  ans = new ArrayList<>();
        helper(0,s,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int i,String s,List<List<String>>ans,List<String> temp){
        if(i==s.length())
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int j=i;j<s.length();j++)
        {
            if(isPalindrom(i,j,s)){
                temp.add(s.substring(i,j+1));
                helper(j+1,s,ans,temp);
                temp.remove(temp.size()-1);
                
            }
        }
    }
    public boolean isPalindrom(int i ,int j, String s)
    {
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
        
    
}