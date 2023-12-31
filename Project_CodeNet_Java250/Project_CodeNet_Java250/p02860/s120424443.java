import java.util.*;

/*
問題文
正整数 N 及び、長さ N の英小文字から成る文字列 S が与えられます。

この文字列が、ある文字列を二度繰り返したものであるかを判定してください。
則ち、文字列 T であって、S=T+T となるものが存在するかを判定してください。

制約
1≤N≤100
S は英小文字から成る
|S|=N

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String first = s.substring(0, n/2);
        String end = s.substring(n/2, n);

        if (n % 2 == 1 || !first.equals(end)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        sc.close();
    }
}