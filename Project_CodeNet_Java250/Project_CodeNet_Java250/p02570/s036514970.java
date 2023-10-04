    import java.io.*;
    import java.util.*;
    import java.util.LinkedList;

    public class Main {

        public static void main(String[] args) throws IOException {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            InputReader in = new InputReader(inputStream);
            InputReader.OutputWriter out = new InputReader.OutputWriter(outputStream);
            BufferedReader reader = new BufferedReader(new InputReader(System.in));

            double d = in.nextDouble();
            double t = in.nextDouble();
            double s = in.nextDouble();
            double time = d/s;
            if(time<=t) out.println("Yes");
            else out.println("No");
            out.flush();
        }
        private static int gcd(int a, int b) {
            return b == 0 ? a : gcd(b,a%b);
        }
        private static void shuffle(int [] a) {
            for (int i = 0; i < a.length; i++) {
                int index = (int) (Math.random() * a.length);
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
            }
        }
    }

    class InputReader extends BufferedReader {
        StringTokenizer tokenizer;

        public InputReader(InputStream inputStream) {
            super(new InputStreamReader(inputStream), 32768);
        }

        public InputReader(String filename) {
            super(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream(filename)));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(readLine());
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }
            return tokenizer.nextToken();
        }

        public Integer nextInt() {
            return Integer.valueOf(next());
        }
        public Long nextLong() {
            return  Long.valueOf(next());
        }
        public Double nextDouble () {
            return Double.valueOf(next());
        }


        static class OutputWriter extends PrintWriter {
            public OutputWriter(OutputStream outputStream) {
                super(outputStream);
            }

            public OutputWriter(Writer writer) {
                super(writer);
            }

            public OutputWriter(String filename) throws FileNotFoundException {
                super(filename);
            }

            public void close() {
                super.close();
            }
        }
    }