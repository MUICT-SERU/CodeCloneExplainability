//package practice;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;
import java.util.regex.Pattern;






public class Main {

	
	 
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
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
	static int n = (int) 1e5;
	public static void main(String[] args) {
		 FastReader sc = new FastReader();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			out.print(Math.max(0, c-a+b));
			
			 out.close();
		}
		
	 
		
	}