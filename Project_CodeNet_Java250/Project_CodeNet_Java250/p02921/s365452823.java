import java.io.*;
import java.util.*;

class Main {

    // Generated by 1.1.5 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        String T;
        T = sc.next();
        solve(S, T);
    }

    static void solve(String S, String T){
        int ans = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == T.charAt(i)) ans++;
        }
        System.out.println(ans);
    }
}
