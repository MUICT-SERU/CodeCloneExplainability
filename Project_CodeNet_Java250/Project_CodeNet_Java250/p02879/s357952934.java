import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 1 || a > 9 || b < 1 || b > 9) {
            System.out.println(-1);
        }
        else {
            System.out.println(a * b);
        }
    }
}
