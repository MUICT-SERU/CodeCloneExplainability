import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {
    static long MOD = (long)Math.pow(10, 9) + 7;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = in.next();
        String t = in.next();
        for (int i=0; i<N; i++) {
            System.out.print(s.charAt(i));
            System.out.print(t.charAt(i));
        }
    }
}