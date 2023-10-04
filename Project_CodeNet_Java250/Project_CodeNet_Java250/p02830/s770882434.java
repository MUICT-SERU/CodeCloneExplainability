import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
    static class sol{
        public static void solve(InputReader in,PrintWriter out) {
            int n=in.nextInt();
            String s1=in.next();
            String s2=in.next();
            String res="";
            for(int i=0;i<n;i++){
                res+=s1.charAt(i);
                res+=s2.charAt(i);
            }
            out.print(res);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
          InputStream input=System.in;
//        InputStream input=new FileInputStream(new File("src//input.in"));
        InputReader in=new InputReader(input);
        OutputStream output=System.out;
        PrintWriter out=new PrintWriter(output);
        sol a=new sol();
        a.solve(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public boolean hasNext() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    return false;
                }
            }
            return true;
        }

        public String next() {
            if (hasNext())
                return tokenizer.nextToken();
            return null;
        }

        public String nextLine() {
            if (hasNext())
                return tokenizer.nextToken("");
            else
                return null;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

        public BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
