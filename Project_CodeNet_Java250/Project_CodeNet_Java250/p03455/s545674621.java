import java.util.Scanner;

/**
 * @author yoshizaki
 * ABC 086
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "";
        if((a*b)%2 ==1) {
            ans = "Odd";
        } else {
            ans = "Even";
        }
        System.out.println(ans);
    }
}