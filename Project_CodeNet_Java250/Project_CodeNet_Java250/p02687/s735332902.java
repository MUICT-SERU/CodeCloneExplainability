import java.util.Scanner;

/**
 * A - A?C
 * AtCoder 社は、毎週土曜日にコンテストを開催しています。
 * コンテストには ABC と ARC の 2 つの種類があり、毎週どちらか一方が開催されます。
 * ABC が開催された次の週には ARC が開催され、ARC が行われた次の週には ABC が開催されます。
 * 先週開催されたコンテストを表す文字列 S が与えられるので、今週開催されるコンテストを表す文字列を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 先週開催されたコンテスト
        String s = sc.next();

        System.out.println( s.equals( "ABC" ) ? "ARC" : "ABC" );

        sc.close();
    }
}