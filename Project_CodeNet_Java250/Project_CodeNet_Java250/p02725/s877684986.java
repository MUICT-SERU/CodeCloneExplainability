import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static PrintWriter out;

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        CF_Reader in = new CF_Reader();

        long radius = in.nextLong();
        int n = in.nextInt();
        long[] nums = new long[n];
        long prev = 0;
        long maxVal = 0;
        long total = 0;
        for (int i = 0; i < n; i++) {
            long num = in.nextLong();
            nums[i] = num - prev;
            maxVal = Math.max(nums[i], maxVal);
            total += nums[i];
            prev = num;
        }
        out.println(Math.min(total - nums[0], total + (radius - prev) - maxVal));

        out.close();
    }


    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        char nextCharacter() throws IOException {
            return next().charAt(0);
        }

        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
