import java.util.HashSet;
import java.util.Scanner;

/*
問題文
ある街に、N 人のすぬけ君(すぬけ君 1 、すぬけ君 2 、 ...、 すぬけ君 N )が住んでいます。
この街には、 K 種類のお菓子(お菓子 1 、 お菓子 2 、....、お菓子 K )が売られています。
お菓子 i を持っているのは、すぬけ君 Ai,1, Ai,2, ⋯, Ai,di の計 di 人です。

高橋君は今からこの街を回り、お菓子を 1 つも持っていないすぬけ君にいたずらをします。
このとき、何人のすぬけ君がいたずらを受けるでしょうか。

制約
入力は全て整数
1≤N≤100
1≤K≤100
1≤di≤N
1≤Ai,1<⋯<Ai,di≤N
*/

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 全員のすぬけ君
        HashSet<Integer> sunuke = new HashSet<>();

        for (int i = 0; i < n; i++) {
            sunuke.add(i+1);
        }

        for (int i = 0; i < k; i++) {
            int ki = sc.nextInt();

            for (int j = 0; j < ki; j++) {
                int temp = sc.nextInt();
                if (sunuke.contains(temp)) {
                    sunuke.remove(temp);
                }
            }
        }
        System.out.println(sunuke.size());
    }
}