import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static long mod=(long)(1e9+7);
	static int f(int [] a,int n){
		if(n==0||n==1)return 0;
		int x=Integer.MAX_VALUE,y=Integer.MAX_VALUE;
		if((n-2)>=0)
		   x=Math.abs(a[n-1]-a[n-2])+f(a,n-1);
		if((n-3)>=0) 
		   y=Math.abs(a[n-1]-a[n-3])+f(a,n-2);
		return Math.min(x,y);

	}
	public static void main( String [] args) throws IOException{
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
		int [] a=sc.nextIntArray(n);
		// int ans=f(a,n);
		// System.out.println(ans);
		int [] dp=new int[n+1];
		for(int i=0;i<=n;i++){
			if(i==0 || i==1)continue;
			if((i-2)>=0)dp[i]=Math.abs(a[i-1]-a[i-2])+dp[i-1];
			if((i-3)>=0)dp[i]=Math.min(dp[i],Math.abs(a[i-1]-a[i-3])+dp[i-2]);
		}
		System.out.println(dp[n]);
	}
}




































































class FastScanner{	
	 private int BUFFER_SIZE = 1 << 16;
	
	private  DataInputStream din;
	
	private  byte[] buffer;
	
	private int bufferPointer, bytesRead;
	
	public FastScanner() {
		din = new DataInputStream(System.in);
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
	}

	public FastScanner( String file_name) throws IOException {
		din = new DataInputStream(new FileInputStream(file_name));
		buffer = new byte[BUFFER_SIZE];
		bufferPointer = bytesRead = 0;
    }
    
	public String readLine() throws IOException {
		 byte[] buf = new byte[64];
		int cnt = 0, c;
		while ((c = read()) != -1) {
			if (c == '\n')
				break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}
    
    public String next() throws IOException{

		byte c = read();
		while(Character.isWhitespace(c)){
			c = read();
		}
		
		 StringBuilder builder = new StringBuilder();
		builder.append((char)c);
		c = read();
		while(!Character.isWhitespace(c)){
			builder.append((char)c);
			c = read();
		}
		
		return builder.toString();
	}

	public int nextInt() throws IOException {
		int ret = 0;
		byte c = read();
		while (c <= ' ')
			c = read();
		 boolean neg = (c == '-');
		if (neg)
			c = read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}
	
	public int[] nextIntArray( int n) throws IOException {
		 int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = nextInt();
		}
		return arr;
	}

	public long nextLong() throws IOException {
		long ret = 0;
		byte c = read();
		while (c <= ' ')
			c = read();
		 boolean neg = (c == '-');
		if (neg)
			c = read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = read()) >= '0' && c <= '9');
		if (neg)
			return -ret;
		return ret;
	}
	
	public long[] nextLongArray( int n) throws IOException {
		 long arr[] = new long[n];
		for(int i = 0; i < n; i++){
			arr[i] = nextLong();
		}
		return arr;
	}

	public char nextChar() throws IOException{
		byte c = read();
		while(Character.isWhitespace(c)){
			c = read();
		}
		return (char) c;	
	}
	
	public double nextDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = read();
		while (c <= ' ')
			c = read();
		 boolean neg = (c == '-');
		if (neg)
			c = read();

		do {
			ret = ret * 10 + c - '0';
		} while ((c = read()) >= '0' && c <= '9');

		if (c == '.') {
			while ((c = read()) >= '0' && c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		if (neg)
			return -ret;
		return ret;
    }
    
	public double[] nextDoubleArray( int n) throws IOException {
		 double arr[] = new double[n];
		for(int i = 0; i < n; i++){
			arr[i] = nextDouble();
		}
		return arr;
	}

	private void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private byte read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	public void close() throws IOException {
		if (din == null)
			return;
		din.close();
	}

}


