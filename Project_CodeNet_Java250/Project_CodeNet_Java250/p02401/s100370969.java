import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
 
         
        while(true){
         
        int a = scan.nextInt();
        String op = scan.next();
        int b = scan.nextInt();
     
 
         
        if(op.equals("+")){
        System.out.printf("%d\n",a+b);
            }
        if(op.equals("-")){
            System.out.printf("%d\n",a-b);
            }
        if(op.equals("*")){
            System.out.printf("%d\n",a*b);
            }
        if(op.equals("/")){
            System.out.printf("%d\n",a/b);
            }
        if(op.equals("?")){
            return;
        }
        }
    }   
}