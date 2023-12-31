import java.util.*;
import java.util.stream.IntStream;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = sc.nextInt();
    int[] dp = new int[N];
    dp[0] = 0;
    dp[1] = Math.abs(a[1]-a[0]);
    for (int i = 2; i < N; i++) {
      dp[i] = Math.min(dp[i-2] + Math.abs(a[i] - a[i-2]), 
                       dp[i-1] + Math.abs(a[i] - a[i-1]));
    }
    //System.out.println(Arrays.toString(dp));
    System.out.println(dp[N-1]);
  }
}