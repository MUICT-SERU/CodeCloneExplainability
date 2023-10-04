import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A[] = new int[N];
        int B[] = new int[N-1];
        for (int i=0; i<N; i++)
            A[i] = 100_000;
        for (int i=0; i<N-1; i++) {
            B[i] = Integer.parseInt(sc.next());
            if (B[i]<A[i])
                A[i] = B[i];
            if (B[i]<A[i+1])
                A[i+1] = B[i];
        }
        sc.close();

        int sum = Arrays.stream(A).sum();

        PrintWriter out = new PrintWriter(System.out);
        out.println(sum);
        out.flush();
    }
}