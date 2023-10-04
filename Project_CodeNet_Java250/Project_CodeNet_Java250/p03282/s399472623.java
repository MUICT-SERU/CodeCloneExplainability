import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    long K = sc.nextLong();
    int idx = -1;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) != '1') {
        idx = i;
        break;
      }
    }
    if (idx < 0) {
      System.out.println(1);
    } else {
      if (K < idx + 1) {
        System.out.println(1);
      } else {
        System.out.println(S.charAt(idx));
      }
    }
  }
}