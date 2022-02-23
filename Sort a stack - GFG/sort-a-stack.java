// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
     public static void insertAtStorteStack(Stack<Integer>stack,int x) {
        	if(stack.isEmpty() || (!stack.isEmpty() && stack.peek()<x)){
        	      stack.push(x);
        	      return;
        	}
        	else
            {
                int y = stack.peek();
                stack.pop();
                insertAtStorteStack( stack, x);
                stack.push(y);
            }
    
    
    }
    public void sort1(Stack<Integer> stack){
        if(stack.isEmpty())
        return;
        int x = stack.peek();
        stack.pop();
        sort1(stack);
        insertAtStorteStack(stack,x);
    }
	public Stack<Integer> sort(Stack<Integer> stack)
	{
		
        sort1(stack);
        return stack;
	}
}