import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n - 1];
		
		for (int i = 0; i < n - 1; i++) {
			b[i] = sc.nextInt();
		}
		a[0] = b[0];
		a[1] = b[0];
		
		long res = 0;
		
		for (int i = 2; i < n; i++) {
			int bN = b[i-1];
			if (bN > a[i-1]) {
				a[i] = bN;
			} else {
				a[i] = bN;
				a[i-1] = bN;
			}
		}
		// System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			res += a[i];
		}
		// System.out.println(Arrays.toString(b));
		System.out.println(res);
		
	}
  
    static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
	          e.printStackTrace();
	        }
	      }
	      return st.nextToken();
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
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}