import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= T; i++)if(i % A == 0)ans += B;
        System.out.println(ans);
    }
}
