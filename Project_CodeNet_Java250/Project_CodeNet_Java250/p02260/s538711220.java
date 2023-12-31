import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int cnt = sort(A);
        for (int i = 0; i < N; i++) {
            System.out.print(A[i]);
            if (i == N - 1) {
                System.out.println("");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(cnt);
    }

    private static int sort(int[] a) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            int mi = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[mi]) {
                    mi = j;
                }
            }
            if (i != mi) {
                int t = a[i];
                a[i] = a[mi];
                a[mi] = t;
                cnt++;
            }
       }
        return cnt;
    }
}