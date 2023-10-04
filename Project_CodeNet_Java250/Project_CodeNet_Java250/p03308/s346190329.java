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
        ABC102_B solver = new ABC102_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC102_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long tmp = in.nextLong();

                max = Math.max(max, tmp);
                min = Math.min(min, tmp);
            }

            out.print(max - min);
        }

    }
}

