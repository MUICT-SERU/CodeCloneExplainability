import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        

        if(n >= 64){
            System.out.println(64);
        }else if(n >= 32){
            System.out.println(32);
        }else if(n >= 16){
            System.out.println(16);
        }else if(n >= 8){
            System.out.println(8);
        }else if(n >= 4){
            System.out.println(4);
        }else if(n == 3 || n == 2){
            System.out.println(2);
        }else if(n == 1){
            System.out.println(1);
        }
    }
}