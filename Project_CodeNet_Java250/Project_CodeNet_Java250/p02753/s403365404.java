import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AStationAndBus solver = new AStationAndBus();
        solver.solve(1, in, out);
        out.close();
    }

    static class AStationAndBus {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            if (s.contains("A") && s.contains("B")) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

    }
}

