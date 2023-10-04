import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int MAX_COLOR = 8;
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String strArr[] = br.readLine().split(" ");
            int colArr[] = new int[MAX_COLOR + 1];
            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(strArr[i]);
                if (tmp >= 1 && tmp <= 399) {
                    colArr[0]++;
                } else if (tmp >= 400 && tmp <= 799) {
                    colArr[1]++;
                } else if (tmp >= 800 && tmp <= 1199) {
                    colArr[2]++;
                } else if (tmp >= 1200 && tmp <= 1599) {
                    colArr[3]++;
                } else if (tmp >= 1600 && tmp <= 1999) {
                    colArr[4]++;
                } else if (tmp >= 2000 && tmp <= 2399) {
                    colArr[5]++;
                } else if (tmp >= 2400 && tmp <= 2799) {
                    colArr[6]++;
                } else if (tmp >= 2800 && tmp <= 3199) {
                    colArr[7]++;
                } else {
                    colArr[8]++;
                }
            }
            int min = 0;
            for (int i = 0; i < MAX_COLOR; i++) {
                if (colArr[i] > 0) {
                    min++;
                }
            }
            int max = 0;
            if (colArr[8] > 0) {
                if (min == 0) {
                    min++;
                    max = colArr[8];
                } else {
                    max = colArr[8] + min;
                }
            } else {
                max = min;
            }
            System.out.println(min + " " + max);
       } catch (IOException e) {
            e.printStackTrace();
       }
    }
}
