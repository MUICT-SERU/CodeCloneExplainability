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
        long n = s.nextLong();
        
        long a = 0;
        long b = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
          if (n%i == 0) {
            if (i > a) {
              a = i;
              b = n/i;
            }
          }
        }

        System.out.println(a + b - 2);
    }
}