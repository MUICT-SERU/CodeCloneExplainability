import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String U = sc.next();
    sc.close();

    if (S.equals(U)) A--;
    if (T.equals(U)) B--;

    System.out.println(A + " " + B);
  }
}
