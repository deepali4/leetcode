// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        int ans=0;
        
        int[] mst = new int[V];
        
        int[] key = new int[V];
        
        Arrays.fill(key,Integer.MAX_VALUE);
        Arrays.fill(mst,0);
        
        key[0]=0;
       
        
        for(int i =0; i<V ;i++)
        {
            // -- find the minimum of the key if that is not added to  mst
            int min = Integer.MAX_VALUE; int u =-1;
            for(int v =0;v<V; v++)
            {
                if(mst[v]==0 && key[v]<min)
                {   min = key[v];
                    u=v;
                }
                
            }
            
            // -- set visted of that vertes in mst
            mst[u]= 1;
            
            // update keys of adjeson nodes
            
            for(ArrayList<Integer> x : adj.get(u))
            {
                if(mst[x.get(0)]==0  &&  x.get(1)< key [ x.get(0)])
                key [ x.get(0)]= x.get(1);
            }
            
            
            
        }
        
        
        
        
        for(int x : key)
        {
            ans+=x;
        }
        return ans;
        
    }
}
