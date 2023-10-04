import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B0Or1Swap solver = new B0Or1Swap();
        solver.solve(1, in, out);
        out.close();
    }

    static class B0Or1Swap {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n + 1];
            int count = 0;
            for (int i = 1; i <= n; i++) a[i] = in.nextInt();
            for (int i = 1; i <= n; i++) {
                if (a[i] == i) {
                    continue;
                }
                if (a[a[i]] == i) {
                    count++;
                    int temp = a[i];
                    a[i] = i;
                    a[temp] = temp;
                    continue;
                }
                out.println("NO");
                return;
            }
            if (count <= 1)
                out.println("YES");
            else {
                out.println("NO");
            }
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

