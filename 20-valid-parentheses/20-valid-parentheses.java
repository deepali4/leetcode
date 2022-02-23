class Solution {
    public boolean isValid(String s) {
        
     Stack<Character> stack1 = new Stack<>();
        for(int i=0;i<s.length();i++)
        {  
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                stack1.push(s.charAt(i));
            else if(!stack1.isEmpty()&&(
                    (s.charAt(i) == '}' && stack1.peek() == '{')||
                    (s.charAt(i) == ']' && stack1.peek() == '[')||
                    (s.charAt(i) == ')' && stack1.peek() == '(') )) {
                stack1.pop();
            } else return false;
        }

        return stack1.isEmpty();
    }
}