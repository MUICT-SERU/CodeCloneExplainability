import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(S.length()<6 ? "No" : S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5) ? "Yes" : "No") ;
    }
}