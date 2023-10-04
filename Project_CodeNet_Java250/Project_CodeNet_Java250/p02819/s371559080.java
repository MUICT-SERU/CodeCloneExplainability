import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int x = Integer.parseInt(stdIn.next());

    if (x != 2 && x % 2 == 0) x++;
    while (true) {
      int i;
      double sqrtNum = Math.sqrt(x);
      for (i = 3; i <= sqrtNum; i += 2) {
        if (x % i == 0) break;
      }
      if (i > sqrtNum) break;
      x += 2;
    }

    System.out.println(x);
  }
}
