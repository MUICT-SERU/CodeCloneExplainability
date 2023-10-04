import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) { new Main(); }
	FS in = new FS();
	PrintWriter out = new PrintWriter(System.out);

	int a, b;	
	
	Main() {
		a = in.nextInt();
		b = in.nextInt();
		if (a <= 9 && b <= 9)
			out.println((a * b));
		else
			out.println(-1);

		out.close();
	}

	
	
	int abs(int x) { if (x < 0) return -x; return x; }
	long abs(long x) { if (x < 0) return -x; return x; }
	int max(int x, int y) { if (x < y) return y; return x; }
	int min(int x, int y) { if (x > y) return y; return x; }
	long max(long x, long y) { if (x < y) return y; return x; }
	long min(long x, long y) { if (x > y) return y; return x; }

	class FS {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch (Exception e) {}
			} return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }

		void intArr(int sz, int[] x) { for (int i = 0; i < sz; i++) x[i] = nextInt(); }
		void longArr(int sz, long[] x) { for (int i = 0; i < sz; i++) x[i] = nextLong(); }
		void doubleArr(int sz, double[] x) { for (int i = 0; i < sz; i++) x[i] = nextDouble(); }
	}
}

