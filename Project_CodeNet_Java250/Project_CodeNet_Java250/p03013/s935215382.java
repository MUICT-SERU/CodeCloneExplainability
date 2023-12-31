import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
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
            }  while ((c = read()) >= '0' && c <= '9');

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
            do {
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

            do {
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

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
    public static void main(String args[]) throws IOException{
        Reader in = new Reader();
        int n = in.nextInt();
        int m = in.nextInt();
        long[] numOfWays = new long[n + 2];
        for (int i = 0; i < m; i++){
            int ind = in.nextInt() + 1;
            numOfWays[ind] = -1;
            if (numOfWays[ind] == numOfWays[ind - 1]){
                System.out.println(0);
                return;
            }
        }
        numOfWays[0] = 0;
        numOfWays[1] = 1;
        for (int i = 2; i < numOfWays.length; i++){
            if (numOfWays[i] == -1)
                continue;
            if (numOfWays[i - 1] == -1){
                numOfWays[i] = numOfWays[i - 2];
                continue;
            }
            if (numOfWays[i - 2] == -1){
                numOfWays[i] = numOfWays[i - 1];
                continue;
            }
            numOfWays[i] = numOfWays[i - 1] + numOfWays[i - 2];
            numOfWays[i] %= 1000000007;
        }
        System.out.println(numOfWays[n + 1]);
    }
}
