import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String s=sc.next();
		String t=sc.next();
		int a=sc.nextInt();
		int b=sc.nextInt();
		String u=sc.next();
		boolean x=true;
		if(s.length()==u.length()&&t.length()!=u.length())
			x=true;
		else if(s.length()!=u.length()&&t.length()==u.length())
			x=false;
		else {
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)!=u.charAt(i)) {
				x=false;
			    break;
			}
		}
		}
		if(x==true)
			a--;
		else
			b--;
		pw.print(a+" "+b);
		pw.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}