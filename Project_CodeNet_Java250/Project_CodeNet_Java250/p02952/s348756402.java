import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; ++i) {
            String s = Integer.toString(i);
            if (s.length() % 2 == 1) ++cnt;
        }

        System.out.println(cnt);
    }
}