import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();

        if (U.equals(S))
            A -= 1;
        else
            B -= 1;

        System.out.println(A + " " + B);
    }
}