import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BCollatzProblem solver = new BCollatzProblem();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCollatzProblem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt();

            int i = 1;

            HashSet<Integer> visited = new HashSet<>();
            visited.add(a);
            for (; ; i++) {
                if (a % 2 == 0) {
                    a /= 2;
                } else {
                    a = 3 * a + 1;
                }
                if (visited.contains(a)) {
                    break;
                }
                visited.add(a);
            }

            out.println(i + 1);
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

