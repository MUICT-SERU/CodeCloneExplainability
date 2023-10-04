import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] vList = new int[n];

        for(int i = 0; i < n; i++) {
            vList[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {
            ans += Math.max(0, vList[i] - sc.nextInt());
        }

        // 出力
        System.out.println(ans);
    }
}