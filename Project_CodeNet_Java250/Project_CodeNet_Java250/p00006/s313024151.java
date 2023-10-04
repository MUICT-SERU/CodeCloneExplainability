import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        char[] cs = in.next().toCharArray();
        for (int i = cs.length - 1; i >= 0; i--) {
            System.out.print(cs[i]);
        }
        System.out.println();
    }
}