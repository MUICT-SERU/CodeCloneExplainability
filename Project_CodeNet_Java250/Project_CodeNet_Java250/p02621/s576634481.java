import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        int ans = a + a*a + a*a*a;
        
        System.out.println(ans);
    }

}