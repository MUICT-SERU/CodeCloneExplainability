import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       int c = in.nextInt();
       if(a < b && b < c) System.out.println("Yes");
       else System.out.println("No");
    }
}