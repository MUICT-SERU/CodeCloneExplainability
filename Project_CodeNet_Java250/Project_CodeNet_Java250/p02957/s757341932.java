import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();

        int calc = (a + b) % 2;

        if (calc == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println((a + b) / 2);
        }
    }
}