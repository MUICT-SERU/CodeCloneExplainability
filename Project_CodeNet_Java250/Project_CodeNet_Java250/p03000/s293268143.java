import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int now = 0;
        int ans = 1;
        for(int i = 0; i < n; i++){
            now += sc.nextInt();
            if(now > x){
                break;
            }else{
                ans++;
            }
        }
        System.out.println(ans);
    }
}