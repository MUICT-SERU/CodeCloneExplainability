import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replaceAll("/", "");
        Integer in = Integer.valueOf(s);
        if (in <= 20190430) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
