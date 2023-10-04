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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String N = in.next();

            int n = Integer.valueOf(N);
            int s = 0;

            for (int i = 0; i < N.length(); i++) {
                s += Integer.valueOf(N.charAt(i) - 48);
            }

            if (n % s == 0) {
                out.println("Yes");
            } else {
                out.println("No");
            }
            return;

        }

    }
}

