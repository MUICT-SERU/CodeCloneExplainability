
import java.util.*;


/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] map = new int[51];

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            int temp = scanner.nextInt();
            map[temp - 1]++;
            temp = scanner.nextInt();
            map[temp - 1]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(map[i]);
        }

    } // mainMethod


} // MainClass
