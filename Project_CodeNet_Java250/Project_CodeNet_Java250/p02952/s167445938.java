import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int digit = 0;
            int num = i;
            while (num != 0) {
                num /= 10;
                digit++;
            }
            if (digit % 2 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
