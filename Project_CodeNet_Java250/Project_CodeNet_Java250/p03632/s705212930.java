import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, d, ans = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        if(a <= c){
            if(b > c){
                if(b <= d) {
                    ans = b - c;
                }else{
                    ans = d - c;
                }
            }
        }else{
            if(d > a){
                if(d <= b) {
                    ans = d - a;
                }else{
                    ans = b - a;
                }
            }
        }

        System.out.println(ans);
    }
}
