import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        private boolean check(long a, long b) {
            return (a ^ b) >= 0;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long d = in.nextLong();
            long left = 0, right = 0;
            //++
            //--
            if (check(a, b)) {
                //++
                if (a >= 0) {
                    if (check(c, d)) {
                        if (c >= 0) {
                            left = Math.max(a, b);
                        } else {
                            left = Math.min(a, b);
                        }
                    } else {
                        left = Math.max(a, b);
                    }
                    right = Math.max(c, d);
                } else if (a < 0) {
                    //--
                    if (check(c, d)) {
                        if (c >= 0) {
                            //--++
                            left = Math.max(a, b);
                        } else {
                            left = Math.min(a, b);
                        }
                    } else {
                        left = Math.min(a, b);
                    }
                    right = Math.min(c, d);
                }
            } else {
                //+-
                if (check(c, d)) {
                    if (c >= 0) {
                        left = Math.max(a, b);
                        right = Math.max(c, d);
                    } else {
                        // +- --
                        left = Math.min(a, b);
                        right = Math.min(c, d);
                    }
                } else {
                    long max_ab = Math.max(a, b);
                    long min_ab = Math.min(a, b);
                    long max_cd = Math.max(c, d);
                    long min_cd = Math.min(c, d);
                    if (max_ab * max_cd > min_cd * min_ab) {
                        left = Math.max(a, b);
                        right = Math.max(c, d);
                    } else {
                        left = Math.min(a, b);
                        right = Math.min(c, d);
                    }
                }
            }
            out.print(left * right);
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

        public void print(long i) {
            writer.print(i);
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

        public long nextLong() {
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
}

