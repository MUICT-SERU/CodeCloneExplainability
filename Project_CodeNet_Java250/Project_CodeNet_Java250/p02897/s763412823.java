import java.io.*;
import java.util.*;

class Main {

    // Generated by 1.1.6 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        solve(N);
    }

    static void solve(long N){
        int odd=0, sum=0;
        for (int i=1; i<=N; i++) {
            if (i%2 == 1) odd++;
            sum++;
        }
        System.out.println((double)odd/(double)sum);
    }
}