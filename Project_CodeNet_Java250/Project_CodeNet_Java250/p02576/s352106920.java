import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
public class Main {


    
    public static void main(String args[] ) throws Exception {
        PrintWriter pw=new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        int n  = sc.nextInt();
        int x  = sc.nextInt();
        int t  = sc.nextInt();
        int ans=0;
        int te=0;
        while(te<n){
            te+=x;
            ans+=t;
        }
        pw.println(ans);
        
        
        
        
       
        
        pw.close();
    }
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public static <T> void deb(T x){
       System.out.println(x);
   }
   
   
   static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		public String next(int k) {
			try {
				return br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "Not able to read";
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
	    
	}
   
}