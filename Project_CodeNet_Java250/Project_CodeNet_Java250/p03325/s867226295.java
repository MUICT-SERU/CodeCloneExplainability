import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      ans += Integer.numberOfTrailingZeros(a);
    }
    System.out.println(ans);
  }
}
