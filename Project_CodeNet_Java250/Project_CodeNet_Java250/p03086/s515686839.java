import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            String S = in.next();
            List<Character> acgt = new ArrayList<>(Arrays.asList('A', 'C', 'G', 'T'));
            int ans = 0;
            int cnt = 0;
            for (int i = 0; i < S.length(); i++) {
                Character c = S.charAt(i);
                if (acgt.contains(c)) {
                    cnt++;
                } else {
                    ans = Math.max(ans, cnt);
                    cnt = 0;
                }
            }
            ans = Math.max(ans, cnt);
            out.println(ans);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

    }
}

