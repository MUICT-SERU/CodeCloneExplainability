import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            int n = Integer.parseInt(strArr[0]);
            int m = Integer.parseInt(strArr[1]);
            int ans[] = new int[n];
            for (int i = 0; i < m; i++) {
                strArr = br.readLine().split(" ");
                int a = Integer.parseInt(strArr[0]);
                ans[a - 1]++;
                int b = Integer.parseInt(strArr[1]);
                ans[b - 1]++;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(ans[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}