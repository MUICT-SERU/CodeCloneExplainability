import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Integer.parseInt(sc.next());
        }

        System.out.println(15 - sum);
        sc.close();
    }
}
