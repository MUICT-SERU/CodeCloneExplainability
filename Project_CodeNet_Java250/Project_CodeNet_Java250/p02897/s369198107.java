import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        double n = s.nextInt();

        String ans;
        if(n%2 == 0) {
          ans = "0.5000000000";
        } else {
          ans = String.format("%.10f", (n+1)/(2*n));
        }

        System.out.println(ans);
    }
}