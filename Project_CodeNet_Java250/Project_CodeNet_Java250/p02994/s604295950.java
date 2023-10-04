import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt(), l = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int best = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<n;i++) {
            a[i] = l + i;
            sum += a[i];
        }

        //pw.println(Arrays.toString(a));

        for(int i=0;i<n;i++) {
            int b = Math.abs(sum - (sum - a[i]));
            //pw.println(b);
            if(b < best) {
                best = b;
                ans = sum - a[i];
            }
        }

        pw.println(ans);
        pw.close();
    }
}