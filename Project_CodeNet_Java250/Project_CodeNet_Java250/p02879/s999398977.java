import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(9 < Math.max(a, b)) {
            System.out.println(-1);
        } else {
            System.out.println(a * b);
        }
    }
}