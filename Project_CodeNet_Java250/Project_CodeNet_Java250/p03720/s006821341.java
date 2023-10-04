import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] ans = new int[N+1];
    for (int i = 0; i < M; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      ans[a]++;
      ans[b]++;
    }
    for (int i = 1; i <= N; i++) {
      System.out.println(ans[i]);
    }
  }
}