import java.io.*;
import java.util.*;

public class Main {
    void run() {
        int S = readInt();
        int h = S / 3600;
        int m = (S % 3600) / 60;
        int s = (S % 3600) % 60;
        sysout.printf("%d:%d:%d\n", h, m, s);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    // flush automatically iff you call `println` or `printf` or `format`.
    PrintWriter sysout = new PrintWriter(System.out, true);

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer buffer = null;

    String readLine() {
        buffer = null;
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String read() {
        if (buffer == null || !buffer.hasMoreTokens()) {
            buffer = new StringTokenizer(readLine());
        }
        return buffer.nextToken();
    }

    int readInt() {
        return Integer.parseInt(read());
    }

    long readLong() {
        return Long.parseLong(read());
    }

    double readDouble() {
        return Double.parseDouble(read());
    }
}