
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int ans = C-(A-B);
        if(ans <0){
            ans = 0;
        }
        System.out.println("" + ans);
    }

}