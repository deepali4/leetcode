// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        
        Arrays.sort(arr,(a,b) ->( b.profit - a.profit));
        // find the max dedadline day to create slot array
        
        int max=0;
        
        for(int i =0 ; i<n;i++)
        {
            if(arr[i].deadline>max)
            max=arr[i].deadline;
        }
        
      
        int[] slot= new int[max+1];
        
        
         for(int i =0 ; i<max+1;i++){
             slot[i]=-1;
         }
         
         int count=0;
         int profit=0;
         
         //keep selecting job with maximum profit
         // for each job with deadline x check from x day to 0  if slot available \
         // chose that job 
         
         for(int i =0 ; i<n;i++)
             {
                 
                 for(int j=arr[i].deadline;j>0;j--){
                 
                 if(slot[j]==-1)
                    
                    {
                        slot[j]=i;
                        count++;
                        profit += arr[i].profit;
                        break;
                    }
                 }
             }
         
         
         int[] sol = new int[2];
         
         sol[0]=count;
         sol[1]=profit;
         
         
         return sol;
        
        // Your code here
    }
}