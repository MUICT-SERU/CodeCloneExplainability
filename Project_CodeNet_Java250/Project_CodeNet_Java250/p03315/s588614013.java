import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            c += s.charAt(i)=='+'? 1 : -1;
        }
        System.out.println(c);
    }
}
