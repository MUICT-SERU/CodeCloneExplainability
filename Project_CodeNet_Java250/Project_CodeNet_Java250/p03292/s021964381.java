import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int ans = 1000;
        ans = Math.min(ans, Math.abs(a1 - a2) + Math.abs(a1 - a3));
        ans = Math.min(ans, Math.abs(a2 - a1) + Math.abs(a2 - a3));
        ans = Math.min(ans, Math.abs(a3 - a1) + Math.abs(a3 - a2));
        System.out.println(ans);
    }
}