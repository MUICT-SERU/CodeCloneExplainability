import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        s = s + s;
        System.out.println(s.indexOf(p) >=0 ? "Yes" : "No");
    }
}