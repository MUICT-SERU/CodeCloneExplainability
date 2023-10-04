import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int k = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);

        int x, y, cnt = 0;
        for (x = 0; x <= k; x++) {
            for (y = 0; y <= k; y++) {
                if ((0 <= n - x - y) && (n - x - y <= k)) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
