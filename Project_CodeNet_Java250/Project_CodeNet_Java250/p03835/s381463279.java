import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		solve(sc,out);

		out.flush();
	}

	public static void solve(FastScanner sc, PrintWriter out) {
		int k = sc.nextInt();
		int s = sc.nextInt();
		
		int res = 0;
		
		for(int x = 0; x <= k; x++) {
			for(int y = 0; y <= k; y++) {
				int z = s-x-y;
				
				if(z >= 0 && z <= k &&  x+y+z==s) {
					res++;
				}
			}
		}
		out.println(res);
	}

	public static int gcd(int a, int b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		if(a < b) return gcd(b, a);
		if(b == 0) return a;
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a / gcd(a, b) * b;
	}
	
	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    public Pair(final K key, final V value) {
        super(key, value);
    }

    public Pair<V, K> swap() {
    	return new Pair<V, K>(getValue(), getKey());
    }
 }

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
     }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    }
}