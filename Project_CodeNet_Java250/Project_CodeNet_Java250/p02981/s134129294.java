import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.min(k*a,b));

    }
}
