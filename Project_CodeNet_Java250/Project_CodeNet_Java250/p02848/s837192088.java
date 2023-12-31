import java.util.*;

/*
問題文
英大文字のみからなる文字列 S があります。
また、整数 N が与えられます。

S の各文字を、アルファベット順で N 個後の文字に置き換えた文字列を出力してください。

ただしアルファベット順で Z の 1 個後の文字は A とみなします。

制約
0≤N≤26
1≤|S|≤10^4
S は英大文字のみからなる

*/

public class Main {
    public static void main(String[] args){

        // 配列
        String item[] = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L","M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        List<String> list = Arrays.asList(item); 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        String temp[] = new String[s.length()];
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            temp[i] = String.valueOf(s.charAt(i));
        }

        for (int i = 0; i < temp.length; i++) {
            int place = list.indexOf(temp[i]);

            if (place + n <= 25) {
                ans += item[place + n];
            } else {
                ans += item[place + n-26];
            }
        }
        System.out.println(ans);
    }
}