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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int k = Integer.parseInt(in.next());
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int ans = 0;
            int tmp = 0;

            boolean ok = false;

            for (int i = 1; i < 1100; i++) {
                tmp = k * i;
                if (a <= tmp && tmp <= b) ok = true;
            }


            out.println(ok ? "OK" : "NG");

        }

    }
}

