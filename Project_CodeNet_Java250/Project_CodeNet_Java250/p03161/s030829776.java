/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
     public static int minCost(int []h , int curr_ind , int n , int []dp , int k){
	        if(curr_ind > n-1  )
	        return 0;
	        
	        if(dp[curr_ind]!=-1) return dp[curr_ind];
	        
	        int a = Integer.MAX_VALUE;
	        for(int i = curr_ind + 1;i<=Math.min(n,curr_ind+k);i++){
	            
	         a  = Math.min(a ,    (Math.abs(h[curr_ind] - h[i]) + minCost(h , i , n ,dp , k))) ;
	        }
	        
	        
	       
	        
	        return dp[curr_ind] = a;
	        
	        
	    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	   
	    
	    
		// your code goes here
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = sc.nextInt();
			int k = sc.nextInt();
		
		
		int h[] = new int[n+1];
		for(int i =1;i<=n;i++){
		    h[i] = sc.nextInt();
			}
			
			int dp[]=new int[n+1];
			for(int j =0;j<n+1;j++)
			dp[j] = -1;
			
			System.out.println(minCost(h , 1 , n , dp , k));
	}
}
