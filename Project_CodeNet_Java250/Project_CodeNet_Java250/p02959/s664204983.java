import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        int yusha = s.nextInt();        // 勇者の数
        long monsters[] = new long[yusha + 1];    //　モンスターの数を格納する
        long strength[] = new long[yusha];        // 勇者の強さを格納する

        // モンスターを倒した数
        long count = 0;

        for (int i = 0; i < yusha+1; i++) {
            monsters[i] = s.nextInt();
        }

        for (int i = 0; i < yusha; i++) {
            strength[i] = s.nextInt();
        }

        // 勇者の数だけループ
        for (int i = 0; i < yusha; i++) {
            // 2つの街を守ろうとする
            for (int j = 0; j < 2; j++) {
                // 勇者よりモンスターが強い場合倒せる限り倒す
                if (monsters[i+j] >= strength[i]) {
                    count += strength[i];
                    monsters[i+j] = monsters[i+j] - strength[i];    // 残りモンスター数
                    strength[i] = 0;                // 勇者の余力
                } else {
                    count += monsters[j + i];   // 一つの街のモンスターをすべて倒す
                    strength[i] = strength[i] - monsters[i+j];  // 勇者の余力
                    monsters[i+j] = 0;    // 残りモンスター数
                }
            }
        }

        System.out.println(count);
    }
}