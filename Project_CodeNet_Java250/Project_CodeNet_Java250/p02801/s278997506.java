import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ABC151A solver = new ABC151A();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC151A {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      char[] c = in.next().toCharArray();
      out.println((char) (c[0] + 1));
    }

  }
}

