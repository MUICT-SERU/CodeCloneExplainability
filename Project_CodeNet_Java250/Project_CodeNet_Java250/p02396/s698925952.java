import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = 1;
    while (true) {
      int x = scanner.nextInt();
      if (x == 0) break;
      System.out.println("Case " + i + ": " + x);
      i += 1;
    }
  }
}