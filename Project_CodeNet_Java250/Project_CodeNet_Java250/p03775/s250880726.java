/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long test = sc.nextLong();
		long result = Long.MAX_VALUE;
		for(int i = 1; i <= Math.sqrt(test); i++) {
			if(test % i == 0) {
				long digit = Math.max(i, test/i);
				result = Math.min(result, digit);
			}
		}
		String str = result+"";
		System.out.println(str.length());
	}
	
}