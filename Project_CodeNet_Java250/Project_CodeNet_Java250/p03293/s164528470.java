import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        s = s + s;
        System.out.println(s.contains(t) ? "Yes" : "No");
    }
}
