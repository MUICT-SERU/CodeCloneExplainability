import java.util.*;

/*
問題文
東西に N 個の山が連なっており、西の果てには広大な海が広がっています。
各山頂には旅館があり、あなたは海を眺められる旅館を選ぶことにしました。

西から i 番目の山の高さは Hi です。
西から 1 番目の山頂にある旅館からは必ず海を眺めることができます。

西から i (i=2,3,...,N) 番目の山頂にある旅館については、
H1≤Hi,H2≤Hi,..., かつ Hi−1≤Hi のとき、その旅館から海を眺めることができます。

これら N 個の旅館のうち、海を眺められる旅館はいくつあるでしょうか。

制約
入力は全て整数である。
1≤N≤20
1≤Hi≤100
*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int mounts[] = new int[a];

        int max = 0;
        int count = 0;
        for (int i = 0; i < a; i++) {
          mounts[i] = s.nextInt();
          if (mounts[i] >= max) {
            max = mounts[i];
            count++;
          }
        }
        
        System.out.println(count);
    }
}