import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    for(int i = 0; i < N; i++){
      System.out.print(S.charAt(i));
      System.out.print(T.charAt(i));
    }
    System.out.println();
  }
}
    