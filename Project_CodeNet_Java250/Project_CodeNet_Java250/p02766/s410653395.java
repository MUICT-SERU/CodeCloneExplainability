import java.math.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 1;
        while(n>=k){
            n /= k;
            ans ++;
        }
        System.out.println(ans);
    }
}
