import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = Math.log(n) / Math.log(2);
        int a1 = (int) a;
        System.out.println((int) Math.pow(2, a1));
    }
}