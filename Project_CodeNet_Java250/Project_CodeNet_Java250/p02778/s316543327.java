import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        for (int i=0; i<s.length(); i++) {
            s = s.replace(s.charAt(i),'x');
        }

        System.out.println(s);

    }
}