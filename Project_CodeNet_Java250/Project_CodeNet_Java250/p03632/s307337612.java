import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int d = stdIn.nextInt();

        if (c >= b || a >= d)
            System.out.println(0);
        else if ((a <= c && b >= d) || (c <= a && d >= b))
            System.out.println((b - a) < (d - c) ? b - a : d - c);
        else
            System.out.println((b > c && c >= a) ? b - c : d - a);

    }
}
