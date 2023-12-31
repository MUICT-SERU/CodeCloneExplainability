import java.io.DataInputStream;
import java.io.IOException;

class Main {

    final private static int BUFFER_SIZE = 1 << 16;
    private static DataInputStream din;
    private static byte[] buffer;
    private static int bufferPointer, bytesRead;

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        int n = reader.nextInt();
        int counter = 0;
        String ans = "No";

        for (int i = 0; i < n; i++) {
            int a = reader.nextInt();
            int b = reader.nextInt();

            if (counter >= 2 && (a == b)) {
                ans = "Yes";
                continue;
            } else if (a != b) {
                counter = 0;
            } else {
                counter++;
            }
        }

        System.out.println(ans);
    }

    static class Reader {

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
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

        public String readLine() throws IOException {
            byte[] buf = new byte[1000]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
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
}