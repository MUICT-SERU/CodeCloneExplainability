import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int ans = 0;
    while(n > 0) {
      ans++;
      n -= (n % k);
      n /= k;
    }
    System.out.println(ans);
  }
}