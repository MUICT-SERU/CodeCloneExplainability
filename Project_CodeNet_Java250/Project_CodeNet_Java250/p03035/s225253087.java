import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        System.out.println(A >= 13 ? B : A >= 6 ? B/2 : 0);
    }
}
