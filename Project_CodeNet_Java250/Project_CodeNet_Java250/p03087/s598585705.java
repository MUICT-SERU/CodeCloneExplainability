import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static void exec(MyScanner in, PrintWriter out) {
		in.nextInt();
		int Q = in.nextInt();
		String S = in.next();
		int[] t = new int[S.length()];
		for (int i = 0; i < t.length - 1; i += 1) {
			if (S.charAt(i) == 'A' && S.charAt(i + 1) == 'C') {
				t[i + 1] = t[i] + 1;
			} else {
				t[i + 1] = t[i];
			}
		}
		for (int i = 0; i < Q; i += 1) {
			int l = in.nextInt();
			int r = in.nextInt();
			out.println(t[r - 1] - t[l - 1]);
		}
	}

	public static void main(String[] args) {
		PrintWriter w = new PrintWriter(System.out);
		exec(new MyScanner(System.in), w);
		w.flush();
	}

	static class MyScanner {
		static final int BUFFER_SIZE = 1024;
		private final InputStream in;
		private final byte[] buffer = new byte[BUFFER_SIZE];
		private int point;
		private int readLength;
		MyScanner(InputStream in) {
			this.in = in;
		}
		private int nextByte() {
			if (point < readLength) {
				int result = buffer[point];
				point += 1;
				return result;
			}
			try {
				readLength = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (readLength == -1) {
				return -1;
			}
			point = 1;
			return buffer[0];
		}
		static boolean isPrintableCharExceptSpace(int c) {
			return 33 <= c && c <= 126;
		}
		String next() {
			StringBuilder b = new StringBuilder();
			int c = nextByte();
			while (!(c == -1 || isPrintableCharExceptSpace(c))) {
				c = nextByte();
			}
			if (c == -1) {
				throw new NoSuchElementException();
			}
			do {
				b.appendCodePoint(c);
				c = nextByte();
			} while (c != -1 && isPrintableCharExceptSpace(c));
			return b.toString();
		}
		long nextLong() {
			int c = nextByte();
			while (!(c == -1 || isPrintableCharExceptSpace(c))) {
				c = nextByte();
			}
			if (c == -1) {
				throw new NoSuchElementException();
			}
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = nextByte();
			}
			long result = 0L;
			do {
				if (!('0' <= c && c <= '9')) {
					throw new InputMismatchException();
				}
				result = result * 10L + (c - '0');
				c = nextByte();
			} while (c != -1 && isPrintableCharExceptSpace(c));
			return minus ? -result : result;
		}
		int nextInt() {
			long n = nextLong();
			if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
				return (int) n;
			}
			throw new InputMismatchException();
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
