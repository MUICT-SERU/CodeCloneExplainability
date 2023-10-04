import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int train = a * n;
    int taxi = b;
    pw.println(Math.min(train, taxi));
  }
}
