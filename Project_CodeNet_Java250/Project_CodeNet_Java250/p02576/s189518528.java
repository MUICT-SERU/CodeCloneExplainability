import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tok;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
            tok = null;
        }

        public InputReader(String inputFile) throws FileNotFoundException {
            reader = new BufferedReader(new FileReader(inputFile));
            tok = null;
        }

        public String nextLine() {
            String c = "";
            try {
                c = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return c;
        }

        public String next() {
            while (tok == null || !tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(nextLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }

    public static void main(String args[]) {
        InputStream inputstream = System.in;
        OutputStream outputstream = System.out;
        InputReader in = new InputReader(inputstream);
        PrintWriter out = new PrintWriter(outputstream);
        Task solver = new Task();
        solver.solve(in, out);
        out.flush();
    }

    static class Task {
        public void solve(InputReader in, PrintWriter out) {
            int n=in.nextInt();
            int x=in.nextInt();
            int t=in.nextInt();
            int ans=00;
            if(n%x==0)
            ans=n*t/x;
            else{
                int a=n/x + 1;
                ans=a*t;
            }
            out.println(ans);
        }
    }
}