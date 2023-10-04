/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
	    
	    HashMap<String , Integer> map=new HashMap<>();
	    int n=s.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        String ans=s.next();
	        if(!map.containsKey(ans))
	        map.put(ans,1);
	    }
	    System.out.println(map.size());
	}
}
