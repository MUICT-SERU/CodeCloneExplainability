
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int min = 50;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i != 0) {
                continue;
            }
            long cur = N / i;
            int j;
            for (j = 0; cur != 0; cur /= 10, j++) {
            }
            min = j;
        }
        System.out.println(min);
    }
}
