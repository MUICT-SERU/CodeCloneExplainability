import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public class Main {
	static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		StringBuilder ans = new StringBuilder();
		String s = sc.next();
		String t = sc.next();
		for (int i = 0; i < N; i++) {
			ans.append(s.charAt(i));
			ans.append(t.charAt(i));
		}
		pw.println(ans);
		pw.close();
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) { 
		long ans = 1;
		x %= m;
		while (y > 0) { 
			if(y % 2 == 1) 
				ans = (ans * x) % m; 
			y /= 2;  
			x = (x * x) % m;
		} 
		return ans; 
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] arr1, int[] arr2) {
				  return arr1[0]-arr2[0]; //ascending order
	          }
		});
		return array;
	}
    
    public static long[][] sort(long[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<long[]>() {
			  @Override
        	  public int compare(long[] arr1, long[] arr2) {
				  return 0;
	          }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
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
  
        int ni() { 
            return Integer.parseInt(next()); 
        } 
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}