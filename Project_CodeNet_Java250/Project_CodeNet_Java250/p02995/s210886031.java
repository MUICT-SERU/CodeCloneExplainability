import java.util.*;
import java.io.*;
public class Main{
	static int mod = (int)1e9+7;
	public static void main(String sp[])throws IOException{
		//Reader sc = new Reader();
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long total = (b-a+1)-(calc(a,b,c)+calc(a,b,d)-calc(a,b,((c*d)/gcd(c,d))));
		System.out.println(total);
	}
	
	public static long calc(long a, long b, long c){
		long total=0;
		long mod = (a%c);
		if(mod!=0)
			mod=c-mod;
		if(a+mod<=b){
			a+=mod;
			total++;
		}
		long diff = (b-a)/c;
		total+=diff;
		return total;
	}
	
	public static long gcd(long a, long b){
		if(a==0)
			return b;
		
		return gcd(b%a,a);
	}
	
	public static class pair{
		int ai;
		int bi;
	}
	
	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return o1.bi-o2.bi;
		}
	}

	static class Reader
		{
			final private int BUFFER_SIZE = 1 << 16;
			private DataInputStream din;
			private byte[] buffer;
			private int bufferPointer, bytesRead;
			BufferedReader br;
			public Reader()
			{
				din = new DataInputStream(System.in);
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
				br = new BufferedReader(new InputStreamReader(System.in));
			}
	 
			public Reader(String file_name) throws IOException
			{
				din = new DataInputStream(new FileInputStream(file_name));
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			}
	 
			public String readLine() throws IOException
			{
				byte[] buf = new byte[64]; // line length
				int cnt = 0, c;
				while ((c = read()) != -1)
				{
					if (c == '\n')
						break;
					buf[cnt++] = (byte) c;
				}
				return new String(buf, 0, cnt);
			}
			
			
			
	 
			public int nextInt() throws IOException
			{
				int ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do
				{
					ret = ret * 10 + c - '0';
				} while ((c = read()) >= '0' && c <= '9');
	 
				if (neg)
					return -ret;
				return ret;
			}
	 
			public long nextLong() throws IOException
			{
				long ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do
				{
					ret = ret * 10 + c - '0';
				}
				while ((c = read()) >= '0' && c <= '9');
				if (neg)
					return -ret;
				return ret;
			}
	 
			public double nextDouble() throws IOException
			{
				double ret = 0, div = 1;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
	 
				do
				{
					ret = ret * 10 + c - '0';
				}
				while ((c = read()) >= '0' && c <= '9');
	 
				if (c == '.')
				{
					while ((c = read()) >= '0' && c <= '9')
					{
						ret += (c - '0') / (div *= 10);
					}
				}
	 
				if (neg)
					return -ret;
				return ret;
			}
	 
			private void fillBuffer() throws IOException
			{
				bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
				if (bytesRead == -1)
					buffer[0] = -1;
			}
	 
			private byte read() throws IOException
			{
				if (bufferPointer == bytesRead)
					fillBuffer();
				return buffer[bufferPointer++];
			}
			StringTokenizer st;
			String next() {
				while (st == null || !st.hasMoreTokens()) {
					try {
						st = new StringTokenizer(br.readLine());
					} catch (Exception r) {
						r.printStackTrace();
					}
				}
				return st.nextToken();
			}
	 
	 
			public void close() throws IOException
			{
				if (din == null)
					return;
				din.close();
			}
		}
}