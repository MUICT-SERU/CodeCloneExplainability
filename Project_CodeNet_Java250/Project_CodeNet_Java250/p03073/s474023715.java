import java.util.*;

/*
問題文
左右一列に N 枚のタイルが並んでおり、各タイルの初めの色は長さ 
N の文字列 S で表されます。

左から i 番目のタイルは、S の i 番目の文字が 0 のとき黒色で、1 のとき白色で塗られています。

あなたは、いくつかのタイルを黒色または白色に塗り替えることで、どの隣り合う 
2 枚のタイルも異なる色で塗られているようにしたいです。

最小で何枚のタイルを塗り替えることで条件を満たすようにできるでしょうか。

制約
1≤|S|≤10^5
Si は 0 または 1 である。
*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b[] = new String[a.length()];

        HashMap<String, String> map = new HashMap<>();
        map.put("0", "1");
        map.put("1", "0");

        for (int i = 0; i < a.length(); i++) {
          b[i] = String.valueOf(a.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < a.length()-1; i++) {
          if (b[i].equals(b[i+1])) {
            count++;
            b[i+1] = map.get(b[i]);
          }
        }

        System.out.println(count);
    }
}