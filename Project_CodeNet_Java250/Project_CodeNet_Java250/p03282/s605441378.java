import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    long k = sc.nextLong();

    for (int i = 0; i < k; i++) {
      if (s[i] != '1') {
        System.out.println(s[i]);
        return;
      }
    }

    System.out.println(1);

  }

}
