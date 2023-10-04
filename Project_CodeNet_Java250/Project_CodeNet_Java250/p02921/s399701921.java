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
        abc139_a solver = new abc139_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc139_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String[] S = in.next().split("");
            String[] T = in.next().split("");
            int hit = 0;
            for (int i = 0; i < S.length; i++) {
                if (S[i].compareTo(T[i]) == 0) {
                    hit++;
                }
            }
            out.println(hit);
        }

    }
}

