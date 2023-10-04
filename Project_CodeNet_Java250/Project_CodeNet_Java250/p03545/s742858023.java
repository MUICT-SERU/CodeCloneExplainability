import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

    static void exec(MyScanner in, PrintWriter out) {
        String s = in.next();
        int A = Integer.valueOf(s.substring(0, 1));
        int B = Integer.valueOf(s.substring(1, 2));;
        int C = Integer.valueOf(s.substring(2, 3));;
        int D = Integer.valueOf(s.substring(3, 4));;
        int bit = 0;
        while (true) {
            int n = A;
            n += ((bit & 4) == 0 ? 1 : -1) * B;
            n += ((bit & 2) == 0 ? 1 : -1) * C;
            n += ((bit & 1) == 0 ? 1 : -1) * D;
            if (n == 7)
                break;
            bit += 1;
        }
        out.print(A);
        out.print((bit & 4) == 0 ? '+' : '-');
        out.print(B);
        out.print((bit & 2) == 0 ? '+' : '-');
        out.print(C);
        out.print((bit & 1) == 0 ? '+' : '-');
        out.print(D);
        out.println("=7");
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        exec(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
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
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            StringBuilder b = new StringBuilder();
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (!('0' <= c && c <= '9')) {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
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
