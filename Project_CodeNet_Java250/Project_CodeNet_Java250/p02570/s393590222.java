import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] args)
	{
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		A solver = new A();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class A
	{
		int D;
		int T;
		int S;
		
		public void solve(int testNumber, MyScanner in, PrintWriter out)
		{
			D = in.Int();
			T = in.Int();
			S = in.Int();
			out.println(D <= T*S ? "Yes" : "No");
		}
	}
	
	static class MyScanner
	{
		private BufferedReader in;
		private StringTokenizer st;
		
		public MyScanner(InputStream stream)
		{
			in = new BufferedReader(new InputStreamReader(stream));
		}
		
		public String next()
		{
			while( st == null || !st.hasMoreTokens() )
			{
				try
				{
					String rl = in.readLine();
					if( rl == null )
					{
						return null;
					}
					st = new StringTokenizer(rl);
				}
				catch( IOException e )
				{
					return null;
				}
			}
			return st.nextToken();
		}
		
		public int Int()
		{
			return Integer.parseInt(next());
		}
	}
}
