import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {
	    
	    String s = nextString();
	    
	    int mogu = 0;
	    for(int i=0; i<4; i++){
    	    if(s.charAt(i) == '+'){
    	        mogu++;
    	    }else{
    	        mogu--;
    	    }
	    }
	    out.println(mogu);
	    
	}

	void preCalc() {
 
	}
 
	void stress() {
 
	}
 
	void test() {
 
	}
 
	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}
 
	static final Random rng = new Random();
 
	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}
 
	public static void main(String[] args) throws IOException {
		new Main();
	}
 
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
 
	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}
 
	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
 
	int nextInt() {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() {
		return Long.parseLong(nextToken());
	}
 
	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}