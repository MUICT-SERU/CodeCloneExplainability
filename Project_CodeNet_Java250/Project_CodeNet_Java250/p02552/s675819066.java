import java.util.*;		
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;
public class Main{
	static public void main(String args[])throws IOException{
		int tt=1;
		StringBuilder sb=new StringBuilder();
		for(int ttt=1;ttt<=tt;ttt++){
			int x=i();
			x=1-x;
			pln(x+"");
		}
		System.out.print(sb.toString());
	}
	static InputReader in=new InputReader(System.in);
	static OutputWriter out=new OutputWriter(System.out);
	static ArrayList<ArrayList<Integer>> graph;
	static int mod=1000000007;
	static class Pair{
		int x;
		int z;
		Pair(int x,int z){
			this.x=x;
			this.z=z;
		}
		/*@Override
		public int hashCode() 
		{ 
			final int temp = 14; 
			int ans = 1; 
			ans =x*31+y*13; 
			return (int)ans;
		}
       @Override
        public boolean equals(Object o) 
        { 
            if (this == o) { 
                return true; 
            } /
            if (o == null) { 
                return false; 
            } 
            if (this.getClass() != o.getClass()) { 
                return false; 
            } 
            Pair other = (Pair)o; 
            if (this.x != other.x || this.y!=other.y) { 
                return false; 
            } 
            return true; 
        }*/
	}
	public static long[] sort(long[] a){
		int n=a.length;
		ArrayList<Long> ar=new ArrayList<>();
		for(int i=0;i<a.length;i++){
			ar.add(a[i]);
		}
		Collections.sort(ar);
		for(int i=0;i<n;i++){
			a[i]=ar.get(i);
		}
		return a;
	}
	public static long pow(long a, long b){
        long result=1;
        while(b>0){
            if (b % 2 != 0){
                result=(result*a);
                b--;
            } 
            a=(a*a);
            b /= 2;
        }   
        return result;
    }
	public static int gcd(int a, int b){
        if (a == 0){
            return b;
		}
        return gcd(b%a, a);
    }
	public static int lcm(int a, int b){
		return a*(b/gcd(a,b));
	}
	public static long l(){
		String s=in.String();
		return Long.parseLong(s);
	}
	public static void pln(String value){
		System.out.println(value);
	}
	public static int i(){
		return in.Int();
	}
	public static String s(){
		return in.String();
	}
}
class InputReader 
{
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;
	public InputReader(InputStream stream) {
		this.stream = stream;
	}
	public int read() {
		if (numChars== -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
	public int Int() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
	public String String() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	} 
	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	} 
	public String next() {
		return String();
	} 
	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}
class OutputWriter {
	private final PrintWriter writer;
	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}
	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}
	public void print(Object...objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}
	public void printLine(Object...objects) {
		print(objects);
		writer.println();
	}
	public void close() {
		writer.close();
	}
	public void flush() {
		writer.flush();
	}
 }
class IOUtils {
	public static int[] readIntArray(InputReader in, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.Int();
		return array;
	}
} 
