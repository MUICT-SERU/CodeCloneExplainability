import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] c = new int[9];
        Arrays.fill(c, 0);
        for(int i = 0; i < N; i++){
            c[Math.min(in.nextInt() / 400, 8)]++;
        }
        int sum = 0;
        for(int i = 0; i < 8; i++){
            sum += c[i] == 0 ? 0 : 1;
        }
        System.out.println((sum == 0 ? 1 : sum) + " " + (sum + c[8]));
    }
}