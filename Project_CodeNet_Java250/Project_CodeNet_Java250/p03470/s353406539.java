import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> t = new TreeSet<Integer>();
        for (int i = 1; i <= n; i++) {
            t.add(sc.nextInt());
        }
        System.out.println(t.size());
    }
}
