import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    	// Solution sol = new Solution();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	System.out.print((N*(N-1)+M*(M-1))/2);
    }
}