import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println(comp(scan.nextInt() , scan.nextInt(), scan.nextInt()));
    }

    /**
     * 比較して結果を返します。
     */
    private static String comp(int a, int b, int c) {
        if (a < b && b < c) {
            return "Yes";
        } else {
            return "No";
        }
    }
}