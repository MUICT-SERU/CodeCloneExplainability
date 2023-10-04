import java.awt.Frame;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.time.chrono.MinguoChronology;

public class Main {
  static InputReader in;
  static PrintWriter out;
  
  static class Solution {
    void solve() throws IOException {                
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int cnt = 0;

       for (int i = a; i < b+1; i++) {
         if (c % i == 0) cnt++;
       }
        out.println(cnt);
    }
  }

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}

  static class InputReader {
    public BufferedReader br;
    public StringTokenizer st;
    
    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream));
    }
   
    public int nextInt() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }
    
    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken()); 
    }
    
    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }
    
    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }
    
  }
  
}