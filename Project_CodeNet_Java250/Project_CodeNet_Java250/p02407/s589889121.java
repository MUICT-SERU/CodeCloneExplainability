import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        Scanner sc = new Scanner(System.in);
        // 要素数nを読み込み、配列にn個の整数を読み込む
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // 以下で配列aの中身を逆順に表示しよう
        // 改行なしで表示する時は System.out.print(表示する値) を使おう
        // 改行だけを表示する時は System.out.println() を使おう
        for(int j=a.length-1;j>0;j--){
            System.out.print(a[j] + " ");
        }
        System.out.print(a[0]);
        System.out.println();
        sc.close();
    }
}
