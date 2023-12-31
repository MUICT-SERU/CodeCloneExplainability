import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc139_b solver = new abc139_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc139_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int socket = 0;
            int cnt = 0;
            int taps = 0;
            while (true) {
                if (B == 1) {
                    break;
                }
                socket += A;
                if (socket >= B) {
                    taps++;
                    break;
                }
                socket--;
                taps++;
            }
            out.println(taps);
        }

    }
}

