import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = s.charAt(0);
        System.out.println((char) (a + 1));
        sc.close();
    }
}