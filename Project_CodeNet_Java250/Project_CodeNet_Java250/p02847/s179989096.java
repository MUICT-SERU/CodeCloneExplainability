import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();

		String arr[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		String s = sc.next();

		for (int i = 0; i < arr.length; i++) {
			if (s.equals(arr[i])) {
				System.out.println(7 - i);
			}
		}

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
	}
}
