import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int len = S.length();
    String s1 = "dream";
    String s2 = "dreamer";
    String s3 = "erase";
    String s4 = "eraser";
    String ans = "YES";
    // dp[i]はSのインデックス0からi-1までの部分文字列に対する判定結果（出来るなら1、出来ないなら0）
    int[] dp = new int[len + 1];
    dp[0] = 1;
    for(int i = 5; i < len + 1; i++) {
      String str5 = "";
      String str6 = "";
      String str7 = "";
      if(i >= 5) {
        str5 = S.substring(i - 5, i);
        if(s1.equals(str5) && (dp[i - 5] == 1)) dp[i] = 1;
        if(s3.equals(str5) && (dp[i - 5] == 1)) dp[i] = 1;
      }
      if(i >= 6) {
        str6 = S.substring(i - 6, i);
        if(s4.equals(str6) && (dp[i - 6] == 1)) dp[i] = 1;
      }
      if(i >= 7) {
        str7 = S.substring(i - 7, i);
        if(s2.equals(str7) && (dp[i - 7] == 1)) dp[i] = 1;
      }
    }
    if(dp[len] == 0) ans = "NO";
    System.out.println(ans);
  }
}