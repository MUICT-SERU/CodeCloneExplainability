import java.util.Scanner;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int s1 = 0;
        int s2 = 0;
        int min = 100;
        for (int i = 0; i < n; i++) {
            s1 += w[i];
            if (i == 0) {
                for (int t = i+1; t < n; t++) {
                    s2 += w[t];
                }
            } else {
                s2 -= w[i];
            }
            int sum = s2 - s1;
            if (sum < 0) {
                sum = -sum;
            }
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println(min);
    }

}
