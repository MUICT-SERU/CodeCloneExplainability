/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			PrintWriter out=new PrintWriter(System.out);
	FastScanner fs=new FastScanner();
		long a=fs.nextLong();
		double b=fs.nextDouble();
		
	 BigDecimal bg1 = BigDecimal.valueOf(a);
            BigDecimal bg2 = BigDecimal.valueOf(b);
            out.println(bg1.multiply(bg2).setScale(0, RoundingMode.DOWN));
		out.close();
		
	
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble(){
		    return Double.parseDouble(next());
		}
}
}
