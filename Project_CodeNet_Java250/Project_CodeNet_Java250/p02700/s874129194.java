import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int tokillaoki = 0,tokilltaka = 0;

        while (a>0){
            a -= d;
            tokilltaka++;
        }
        while (c>0){
            c -= b;
            tokillaoki++;
        }
        if(tokillaoki<=tokilltaka){
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }


        }


    }



