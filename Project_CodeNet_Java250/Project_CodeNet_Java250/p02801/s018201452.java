

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = str.charAt(0);
        System.out.println((char) (c + 1));
    }
}
