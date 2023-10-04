/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
 */
//入力終了→Ctrl+D
import java.util.*;
import java.awt.*;
import java.awt.Graphics.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        String s=sc.next();
        char[] e=s.toCharArray();
        String p=sc.next();
        for (int i = 0; i < s.length(); i++) {
            String check="";
            for (int j = 0; j < s.length(); j++) {
                check+=e[(i+j)%s.length()];
            }
            if(check.contains(p)){
                out.println("Yes");
                exit(0);
            }
        }
        out.println("No");
    }
}
