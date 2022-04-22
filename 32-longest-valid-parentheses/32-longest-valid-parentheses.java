class Solution {
    public int longestValidParentheses(String s) {
        
        if(s.length()==0||s.length()==1)return 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength=0;
        for(int i =0 ; i < s.length();i++)
        {
            if(s.charAt(i)=='(')
                st.push(i);
            else{
                st.pop();
                if(st.isEmpty())
                    st.push(i);
                else
                    maxLength=Math.max(maxLength,i-st.peek());                
            }
        }
        return maxLength;
    }
}