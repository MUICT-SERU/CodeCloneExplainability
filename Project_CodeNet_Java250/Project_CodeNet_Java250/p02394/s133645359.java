
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int W = scan.nextInt();
        int H = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();

        if (W >= x + r && 0 <= x - r && H >= y + r && 0 <= y - r) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}

