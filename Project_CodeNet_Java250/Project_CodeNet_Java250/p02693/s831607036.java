
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        for(int i = b; i<=c;i++){
            if(i%a==0){
               count++;
               break;
            }
            else{
                continue;
            }
        }
        if(count>0) System.out.println("OK");
        else System.out.println("NG");
    }
}