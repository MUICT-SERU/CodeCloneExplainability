import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int amari = 0;
        int result = 0;

        result = (B - 1) / (A - 1);
        amari = (B - 1) % (A - 1);

        if (amari != 0) {
            result += 1;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);
        sc.close();
        out.flush();
    }
}