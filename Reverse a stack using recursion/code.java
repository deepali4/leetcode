import java.util.Stack;

public class Solution {
    public static void inserAtBottom (Stack <Integer> stack,int x)
    {
        if(stack.isEmpty())
            stack.push(x);
        else{
        int y = stack.peek();
        stack.pop();
            inserAtBottom(stack,x);
            stack.push(y);
        }
    }
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
        
        if(stack.isEmpty())
        return;
        int x = stack.peek();
         stack.pop();
		reverseStack(stack);
        inserAtBottom( stack, x);
	}
    
