import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        int sum = 0;
        for (int i = 1; ;i++) {
            sum = i * a;
            if(sum > t) {
                System.out.println((i - 1) * b);
                return;
            }
        }
    }
}