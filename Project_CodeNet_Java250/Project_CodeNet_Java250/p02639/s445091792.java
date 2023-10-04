//package abc170_A;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastScanner in = new FastScanner(System.in);
		int n = 5;
		for(int i = 1; i <= n; i++)
		{
			int num = in.nextInt();
			if(num == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
///////////////////////////////////TEMPLATE///////////////////////////////////
class FastScanner {
	BufferedReader br;
	StringTokenizer st;

	FastScanner(InputStream stream) {
		try {
			br = new BufferedReader(new InputStreamReader(stream));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	FastScanner(File input) {
		try {
			br = new BufferedReader(new FileReader(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	String nextLine() {
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}

	String next() {
		while (st == null || !st.hasMoreTokens()) {
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
}