import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        Arrays.sort(a);
        System.out.println((a[2] - a[1]) + (a[1] - a[0]));
    }
}
