import java.util.*;

/*
2×N のマス目があります。
上から i 行目、左から j 列目 (1≤i≤2,1≤j≤N) のマスをマス (i,j) と表すことにします。

あなたははじめ、左上のマス (1,1) にいます。 
あなたは、右方向または下方向への移動を繰り返し、右下のマス (2,N) に移動しようとしています。
マス(i,j) には Ai,j 個のアメが置かれています。 
あなたは移動中に通ったマスに置いてあるアメをすべて回収します。
左上および右下のマスにもアメが置かれており、あなたはこれらのマスに置かれているアメも回収します。

移動方法をうまく選んだとき、最大で何個のアメを回収できるでしょうか。
*/
public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b[] = new int[n];
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = s.nextInt();
        }

        int max = 0;
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                temp += b[j];
            }
            for (int j = i-1; j < n; j++) {
                temp += c[j];
            }
            if (temp >= max) {
                max = temp;
            }
            temp = 0;
        }

        System.out.println(max);
    }
}