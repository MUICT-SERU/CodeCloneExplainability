import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        while (x % y != 0) {
            x%=y;
            int tmp = y;
            y = x;
            x = tmp;
        }
        System.out.println(y);
    }
}

