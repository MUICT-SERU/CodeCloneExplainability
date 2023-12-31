import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;

/*
問題文
AtCoder 社は、毎週土曜日にコンテストを開催しています。
コンテストには ABC と ARC の 2 つの種類があり、毎週どちらか一方が開催されます。
ABC が開催された次の週には ARC が開催され、ARC が行われた次の週には ABC が開催されます。

先週開催されたコンテストを表す文字列 S が与えられるので、今週開催されるコンテストを表す文字列を出力してください。

制約
S は ABC または ARC
*/
public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<String, String> map = new HashMap<>();

        map.put("ARC", "ABC");
        map.put("ABC", "ARC");

        System.out.println(map.get(s));
    }
}