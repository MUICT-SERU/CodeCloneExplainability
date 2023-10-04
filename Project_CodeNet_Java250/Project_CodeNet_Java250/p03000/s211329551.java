import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0;i<n;i++) {
            l[i] = scanner.nextInt();
        }

        int d = 0;
        int count = 1;
        for (int i = 0;i<n;i++) {
            d += l[i];
            if (d <= x) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}