import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if((a == 5) && (b == 5) && (c == 7)){
            System.out.println("YES");
        }else if((a == 5)&&(b == 7)&&(c==5)){
            System.out.println("YES");
        }else if((a==7)&&(b==5)&&(c==5)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}