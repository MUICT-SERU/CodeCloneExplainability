import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a-b;
        
        if (d > c) {
            System.out.println("0");
        } else {
            System.out.println(c-d);
        }
    }
}
