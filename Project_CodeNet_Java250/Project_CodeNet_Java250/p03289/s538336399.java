import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.matches("A[a-z]+C[a-z]+")) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
        sc.close();
    }
}