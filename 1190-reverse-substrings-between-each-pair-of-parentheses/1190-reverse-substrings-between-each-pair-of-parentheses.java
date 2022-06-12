class Solution {
    public String reverseParentheses(String s) {
        
        StringBuilder sb= new StringBuilder();
        
        Stack<Character> st = new Stack<>();
        
        
        for(int i = 0 ; i <s.length() ; i++)
        {
            
            if(s.charAt(i) ==')'){
                
                StringBuilder temp = new StringBuilder();
            
                while(st.peek()!='(')
                 temp.append(st.pop());
                st.pop();
                
                 for (int j = 0; j < temp.length(); j++)
                  st.push(temp.charAt(j));
            }
            else {
                st.push(s.charAt(i));
            }
            
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
                
        }
        return sb.reverse().toString();
        
    }
}