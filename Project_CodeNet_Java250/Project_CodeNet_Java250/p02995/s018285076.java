import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author osiruko
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        CAntiDivision solver = new CAntiDivision();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAntiDivision {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long a = in.readLong();
            long b = in.readLong();
            long c = in.readLong();
            long d = in.readLong();

            long t = 0;
            long tt = 0;
            long ttt = 0;
            long count = 0;
            long count2 = 0;
            long count3 = 0;

            BigInteger aa = BigInteger.valueOf(c);
            BigInteger bb = BigInteger.valueOf(d);
            BigInteger cc = aa.gcd(bb);

            long dd = c * d / cc.longValue();

            long aaa = (a - 1) / c;
            long bbb = b / c;
            long aaabbb = bbb - aaa;

            long aaad = (a - 1) / d;
            long bbbd = b / d;
            long aaadbbbd = bbbd - aaad;

            long aaaf = (a - 1) / dd;
            long bbbf = b / dd;
            long aaafbbbf = bbbf - aaaf;

            out.printLine((b - a + 1) - (aaabbb + aaadbbbd - aaafbbbf));

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }
}

