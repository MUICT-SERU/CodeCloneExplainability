import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        
        for (int i = 0; i<n; i++){
            if (sc.nextInt() >= k)
                ans++;
        }
        System.out.println(ans);
    }
}