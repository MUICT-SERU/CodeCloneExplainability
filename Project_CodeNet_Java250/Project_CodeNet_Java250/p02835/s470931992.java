import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A1 = sc.nextInt();
    int A2 = sc.nextInt();
    int A3 = sc.nextInt();
    int ans = A1 + A2 + A3;
    if (ans < 22){
      System.out.println("win");
    } else {
      System.out.println("bust");
    }
  }
}