import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
		FastReader s = new FastReader();
		int n = s.nextInt();
		long sum = 0;
		int max = Integer.MIN_VALUE;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = s.nextInt();
		    if(arr[i] < max){
		        sum += max-arr[i];
		    }
		    max = Math.max(max, arr[i]);
		}
		System.out.println(sum);
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}
