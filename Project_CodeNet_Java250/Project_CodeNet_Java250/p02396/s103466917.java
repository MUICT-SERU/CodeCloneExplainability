import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int i = 1;
        while (sn.hasNext()) {
            int n = sn.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(String.format("Case %d: %d", i, n));
            i++;
        }
    }
}