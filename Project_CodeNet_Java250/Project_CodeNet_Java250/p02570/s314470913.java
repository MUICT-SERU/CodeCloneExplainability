import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int D = sc.nextInt();
            int T = sc.nextInt();
            int S = sc.nextInt();

            double d = (double)D;
            double s = (double)S;
            if ((d/s) <= T)
                System.out.println("Yes");
            else
                System.out.println("No");
    }
}