import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if ((A != B && B != C && A != C) || A == B && B == C)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
