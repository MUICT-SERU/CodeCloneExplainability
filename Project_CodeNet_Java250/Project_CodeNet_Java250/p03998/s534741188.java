import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char[] ac = in.nextLine().toCharArray(), bc = in.nextLine().toCharArray(), cc = in.nextLine().toCharArray();
        int a = 0, b = 0, c = 0;
        char w = 'a';

        while (true) {
            switch (w) {
            case 'a':
                if (a == ac.length) {
                    System.out.println("A");
                    return;
                }
                w = ac[a++];
                break;
            case 'b':
                if (b == bc.length) {
                    System.out.println("B");
                    return;
                }
                w = bc[b++];
                break;
            case 'c':
                if (c == cc.length) {
                    System.out.println("C");
                    return;
                }
                w = cc[c++];
                break;
            }
        }
    }
}
