/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt(),x=scan.nextInt(),t=scan.nextInt();
	    int c=x,time=t;
	    while(c<n)
	    {
	        c+=x;
	        time+=t;
	    }
	    System.out.println(time);
	}
}
