import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        String pattern = "^[0-9]{" + a + "}-[0-9]{" + b + "}$";
        if(s.matches(pattern))System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }

}