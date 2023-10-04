import java.util.Scanner;

/**
 * B - Battle
 * 高橋君と青木君がモンスターを闘わせます。
 * 高橋君のモンスターは体力が A で攻撃力が B です。
 * 青木君のモンスターは体力が C で攻撃力が D です。
 * 高橋君→青木君→高橋君→青木君→... の順に攻撃を行います。
 * 攻撃とは、相手のモンスターの体力の値を自分のモンスターの攻撃力のぶんだけ減らすことをいいます。
 * このことをどちらかのモンスターの体力が 0 以下になるまで続けたとき、 先に自分のモンスターの体力が 0 以下になった方の負け、そうでない方の勝ちです。
 * 高橋君が勝つなら Yes、負けるなら No を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 高橋くんのモンスターの体力
        double a = sc.nextDouble();
        // 高橋くんのモンスターの攻撃力
        double b = sc.nextDouble();
        // 青木くんのモンスターの体力
        double c = sc.nextDouble();
        // 青木くんのモンスターの攻撃力
        double d = sc.nextDouble();

        double takahashi = Math.ceil( a / d );
        double aoki = Math.ceil( c / b );

        System.out.println( takahashi >= aoki ? "Yes" : "No" );

        sc.close();
    }
}