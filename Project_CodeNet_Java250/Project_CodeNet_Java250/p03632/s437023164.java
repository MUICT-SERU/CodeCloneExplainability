import java.util.Scanner;
public class Main{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      if(A >C){
         //0 30
         C = A;
      }else{
         A=C;
      }
      if(B >D){//20 60
         B=D;
      }else{
         D=B;
      }
      if(C>B){
         System.out.println(0);
      }else{
      System.out.println(B-A);
      }
   }
}
      