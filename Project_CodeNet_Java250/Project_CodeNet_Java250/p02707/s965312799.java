import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            array[a]++;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(array[i]);
        }
    }
}
