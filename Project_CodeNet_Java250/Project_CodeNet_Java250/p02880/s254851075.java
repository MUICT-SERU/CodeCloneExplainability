import java.util.*;

/*
問題文
高橋君は九九を覚えたので、1 以上 9 以下の 2 つの整数の積を計算することができます。

整数 N が与えられるので、N を 1 以上 9 以下の2 つの整数の積として表すことができるか
判定し、できるなら Yes を、できないなら No を出力して下さい。

制約
1≤N≤100
N は整数である。

*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int check[] = {2, 3, 4, 5, 6, 7, 8, 9};
        
        String ans = "No";

        if (n >= 10) {
          for (int i = 0; i < check.length; i++) {
            if (n % check[i] == 0 && n / check[i] < 10) {
              ans = "Yes";
              break;
            }
          }
        } else {
          ans = "Yes";
        }
        System.out.println(ans);
    }
}