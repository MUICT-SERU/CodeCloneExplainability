import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        while(true){
            if(x>=y){
                x%=y;
            }else{
                y%=x;
            }
            if(x*y==0){
                break;
            }
        }
        System.out.println(x+y);
        sc.close();
    }
}
