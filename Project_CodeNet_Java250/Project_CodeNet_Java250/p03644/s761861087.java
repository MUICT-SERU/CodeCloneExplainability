import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int num = 2;
    if (n==1){
      System.out.println(1);
    }else{
      while(num*2<=n){
        num = num*2;
      }
      System.out.println(num);
    }
  }
}