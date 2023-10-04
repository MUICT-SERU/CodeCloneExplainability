import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      while ((a % 2) == 0) {
        cnt++;
        a /= 2;
      }
    }

    System.out.println(cnt);

  }
}