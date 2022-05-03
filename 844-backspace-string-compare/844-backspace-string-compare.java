class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> ss = new Stack<Character>();
        Stack<Character> ts = new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
                if(s.charAt(i)=='#' && !ss.isEmpty())
                {
                    ss.pop();
                }
                else  if(s.charAt(i)!='#')
                    ss.push(s.charAt(i));
                
        }
         
        for(int i=0;i<t.length();i++)
        {
            
                if(t.charAt(i)=='#' && !ts.isEmpty())
                {
                    ts.pop();
                }
                else  if(t.charAt(i)!='#')
                    ts.push(t.charAt(i));
                
        }
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        
        while(!ss.isEmpty())
          sb1.append(ss.pop());
         while(!ts.isEmpty())
          sb2.append(ts.pop());
        
       return (sb1.toString().equals(sb2.toString()));
        
    }
}