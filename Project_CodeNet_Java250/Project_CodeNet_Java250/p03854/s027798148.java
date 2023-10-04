import java.util.Scanner;

public class Main {
  static String str;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    str = sc.next();
    int n = str.length();

    boolean[] dp = new boolean[n + 1];
    dp[0] = true;
    for(int i = 5; i <= n; i++){
      if(str.substring(i - 5, i).equals("dream")){
        dp[i] |= dp[i - 5];
      }
      if(str.substring(i - 5, i).equals("erase")){
        dp[i] |= dp[i - 5];
      }
      if(i - 7 >= 0 
        && str.substring(i - 7, i).equals("dreamer")){
          dp[i] |= dp[i - 7];
      }
      if(i - 6 >= 0
        && str.substring(i - 6, i).equals("eraser")){
        dp[i] |= dp[i - 6];
      }
    }

    if(dp[n]){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }
  }
}
