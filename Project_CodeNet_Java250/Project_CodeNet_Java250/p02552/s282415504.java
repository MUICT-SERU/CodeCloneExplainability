import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = Integer.parseInt(scan.next());
    boolean bool = x == 1 ? true : false;
    int result = !bool ? 1 : 0;
    PrintWriter out = new PrintWriter(System.out);
    out.println(result);
    out.flush();
  }
}
