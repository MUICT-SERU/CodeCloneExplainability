import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 9; i++) {
            int target = i * 111;
            if (n <= target) {
                System.out.println(target);
                break;
            }
        }
    }

}
