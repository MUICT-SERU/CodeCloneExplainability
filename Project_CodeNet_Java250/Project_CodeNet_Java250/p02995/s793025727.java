import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;


public class  Main{
    public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        //int n=sc.nextInt();
        //Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=sc.nextInt();
        long a=sc.nextLong()-1;long b=sc.nextLong();
        long c=sc.nextLong();long d=sc.nextLong();
        long l=(lcm(c,d));
        long ans=b/c+b/d-b/l;
        ans=ans-(a/c+a/d-a/l);
        pw.println(b-a-ans);
        pw.flush();
    }
    static long lcm(long a,long b) {
    	return (a/gcd(a,b))*b;
    }
    static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
    static StringBuilder tosb(int[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
    }
    static StringBuilder tosb(long[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
    }
    
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}