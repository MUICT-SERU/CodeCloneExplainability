import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        // 主処理
        int[][] dp = new int[2][n];

        dp[0][0] = a[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + a[0][i];
        }

        dp[1][0] = dp[0][0] + a[1][0];
        for (int i = 1; i < n; i++) {
            dp[1][i] = Math.max(dp[1][i - 1] + a[1][i], dp[0][i] + a[1][i]);
        }

        int result = dp[1][n - 1];

        // 出力
        System.out.println(result);
        sc.close();
    }
}
