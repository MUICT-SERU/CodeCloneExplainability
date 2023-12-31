import java.util.*;

/*
問題文
高橋君は九九を覚えたので、1 以上 9 以下の 2 つの整数の積を計算することができます。
それ以外の計算はできません。

2 つの整数 A,B が与えられます。
高橋君が A×B を計算できるならその結果を、できないなら代わりに -1 を出力してください。

制約
1≤A≤20
1≤B≤20
入力中のすべての値は整数である。
*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        if (a >= 10 || b >= 10) {
          System.out.println(-1);
        } else {
          System.out.println(a*b);
        }
    }
}