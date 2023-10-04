

import java.util.*;
import java.io.*;

public class Main  {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	static void solve() {
		String s = in.nextLine();
		String t = in.nextLine();
		
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != t.charAt(i)) count++;
		}
		System.out.println(count);
	}
	

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] readarr(int abc) {
			int[] a = new int[abc];
			for (int i = 0; i < abc; i++)
				a[i] = nextInt();
			return a;
		}
	}
}



