import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();

        double x = t+0.5;

        int bisnum = ((int)(x / a) * b);

        System.out.println(bisnum);
    }

}