import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task {
		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int[] array = new int[5];
			for(int i = 0; i < array.length; i++) {
				array[i] = in.nextInt();
			}
			int time = 0;
			int tmp = 0;
			int ans = 0;
			for(int i = 0; i < array.length; i++) {
				if(10 - array[i] % 10 > tmp && 10 - array[i] % 10 != 10) {
					tmp = 10 - array[i] % 10;
					ans = i;
				}
			}
			for(int i = 0; i < array.length; i++) {
				if(i != ans) {
					time += (10 - array[i] % 10) + array[i];
					if(array[i] % 10 == 0) {
						time -= 10;
					}
				}
			}
			out.println(time + array[ans]);
 		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;	

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public char nextChar() {
			return next().charAt(0);
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}