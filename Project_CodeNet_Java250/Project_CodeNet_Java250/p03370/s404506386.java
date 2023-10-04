import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] m = new int[n];

        int cnt = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            cnt++;
            total += m[i];
        }

        Arrays.sort(m);

        while (total + m[0] <= x) {
            total += m[0];
            cnt++;
        }

        System.out.print(cnt);
    }
}
