import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ATransfer solver = new ATransfer();
        solver.solve(1, in, out);
        out.close();
    }

    static class ATransfer {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
            int available = a - b;
            int ans = 0;
            if (available >= c)
                ans = c;
            else
                ans = available;
            out.println(c - ans);
        }

    }
}

