import java.io.*;
import java.util.*;

public class Main{
	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e15;
   // public static List<Integer>[] edges;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		boolean found = false;
		for(int i=1;i<=9;++i) {
			for(int j=1;j<=9;++j) {
				if(i*j == n) found = true;
			}
		}
		if(found) out.print("Yes");
		else out.print("No");
		out.close();
	}
}
