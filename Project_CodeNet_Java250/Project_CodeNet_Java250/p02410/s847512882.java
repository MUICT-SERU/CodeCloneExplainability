import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();
        }

        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               c[i] += a[i][j] * b[j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}