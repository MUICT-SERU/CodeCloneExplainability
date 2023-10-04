import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str[] = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            int d = Integer.parseInt(str[3]);
            int num[] = new int[100];
            for (int i = a; i < b; i++) {
                num[i]++;
            }
            for (int i = c; i < d; i++) {
                num[i]++;
            }
            int count = 0;
            for (int i = 0; i < 100; i++) {
                if (num[i] > 1) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
