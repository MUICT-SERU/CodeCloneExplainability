import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String s = a.concat(b);
    int num = Integer.parseInt(s);
    for (int i = 1; i <= 400; i++) {
      if (i * i == num) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}