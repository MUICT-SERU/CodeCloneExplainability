import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] s = sc.next().split("-");
        if(s.length != 2 || s[0].length() != a || s[1].length() != b){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
