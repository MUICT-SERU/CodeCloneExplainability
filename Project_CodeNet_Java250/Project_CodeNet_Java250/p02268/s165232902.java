import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < q; i++) {
            t[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < q; i++) {
            if (Arrays.binarySearch(s, t[i]) >= 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}