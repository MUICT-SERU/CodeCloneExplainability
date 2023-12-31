import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BCountingRoads solver = new BCountingRoads();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCountingRoads {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            int[] ans = new int[n];
            for (int i = 0; i < 2 * m; i++) {
                ans[in.nextInt() - 1]++;
            }
            for (int a : ans) {
                out.println(a);
            }
        }

    }
}

