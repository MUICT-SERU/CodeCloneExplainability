import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        if (a == b && b != c) {
            System.out.println("Yes");
        } else if (b == c && a != b) {
            System.out.println("Yes");
        } else if (a == c && a != b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}