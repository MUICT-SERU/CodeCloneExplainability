import java.util.*;

public class Main {
    public static int solve() {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] roads = new int[n];

        for (int i = 0; i < m; i++) {
            roads[sc.nextInt()-1]++;
            roads[sc.nextInt()-1]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(roads[i]);
        }
    }
}
