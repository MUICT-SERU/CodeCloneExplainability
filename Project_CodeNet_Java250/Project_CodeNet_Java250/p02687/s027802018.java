import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        if (S.charAt(1) == 'B') {
            System.out.println("ARC");
        } else if (S.charAt(1) == 'R') {
            System.out.println("ABC");
        } else {

        }
    }
}