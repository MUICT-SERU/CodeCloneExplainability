import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        long A[] = new long[N];
        boolean zero = false;
        for(int i = 0; i < N; i++){
            A[i] = in.nextLong();
            if(A[i] == 0){
                zero = true;
            }
        }
        
        if(zero){
            println(0);
        }
        else{
            /*
                curr = prev * a[i]
                curr <= 1e18
                prev * a[i] <= 1e18
                a[i] <= 1e18/prev
            */

            long limit = (long) 1e18;
            long res = 1;
            for(long a: A){
                if(a <= limit/res){
                    res = res * a;
                }
                else{
                    res = -1;
                    break;
                }
            }

            println(res);
        }
        in.close();
        out.close();
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static int[] readInt(int N) throws IOException { 
    	int arr[] = new int[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextInt(); 
    	} 
    	return arr;
    }
    
    static long[] readLong(int N) throws IOException { 
    	long arr[] = new long[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.nextLong(); 
    	} 
    	return arr;
    }
    
    static String[] readString(int N) throws IOException { 
    	String arr[] = new String[N];
    	for(int i = 0; i < N; i++){ 
    		arr[i] = in.next(); 
    	} 
    	return arr;
    }
    
    static void print(Object O) {  
    	out.print(O); 
    }
    
    static void println(Object O) { 
    	out.println(O); 
    }
    
    static void println(int arr[]) { 
    	for(int i = 0; i < arr.length; i++){ 
    		print(arr[i] + " "); 
    	} 
    	println(""); 
    }
    
    static void debug(Object ... O) { 
    	for(Object obj: O){
    		System.out.print(obj + " ");
    	}
    	System.out.println();
    }
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}