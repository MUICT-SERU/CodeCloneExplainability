import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans;

        if(a >= 13){
            ans = b;
        }else if(a <= 5){
            ans = 0;
        }else{
            ans = b / 2;
        }

        System.out.println(ans);
    }
}
