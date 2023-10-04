

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

//Main
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int n=sc.nextInt();
		int a[]=sc.readArray(n);
		int prev=a[0];
		long ans=0;
		for (int i = 1; i < a.length; i++) {
			
			prev=Math.max(prev, a[i]);
			
			ans+=prev-a[i];
			
		}
		System.out.println(ans);

	}

	static final Random random = new Random();

	static void ruffleSort(int[] a) {
		int n = a.length;//shuffle, then sort 
		for (int i = 0; i < n; i++) {
			int oi = random.nextInt(n), temp = a[oi];
			a[oi] = a[i];
			a[i] = temp;
		}
		Arrays.sort(a);
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
