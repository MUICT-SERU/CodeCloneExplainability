import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
			FastScanner fsc = new FastScanner();

			int Radius = fsc.nextInt();

			int  Diameter = Radius * 2;
			//Math.PIは円周率定数
			double anser = Diameter * Math.PI;
			System.out.println(anser);

	}

}

class FastScanner {

	BufferedReader br;

	StringTokenizer st;



	public FastScanner() {

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

}