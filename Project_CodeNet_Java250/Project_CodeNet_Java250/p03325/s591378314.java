

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = Integer.parseInt(in.nextLine());
        int[] arr = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            while (arr[i] % 2 == 0) {
                arr[i] >>= 1;
                res++;
            }
        }
        in.nextLine();
        System.out.println(res);
    }
}
