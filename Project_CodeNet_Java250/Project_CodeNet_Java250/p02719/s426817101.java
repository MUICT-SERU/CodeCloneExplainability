import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long a = n / k;
        
        System.out.println(Math.min(n, Math.min(Math.abs(n-k*(a+1)), Math.abs(n-k*a))));
    }
}
