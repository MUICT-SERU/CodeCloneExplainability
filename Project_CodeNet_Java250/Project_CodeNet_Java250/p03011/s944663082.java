
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pqr = new int[3];
        
        for (int i = 0 ; i < 3 ; i++) {
            pqr[i] = scanner.nextInt();
        }

        Arrays.sort(pqr);

        System.out.println(pqr[0] + pqr[1]);
    }
}
