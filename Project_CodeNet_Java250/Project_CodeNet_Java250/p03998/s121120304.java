import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    int numA = 0;
    int numB = 0;
    int numC = 0;
    char present = 'a';
    String ans = "";
    while((numA <= a.length()) && (numB <= b.length()) && (numC <= c.length())) {
      if(present == 'a') {
        if(numA == a.length()) {
          ans = "A";
          break;
        }
        present = a.charAt(numA);
        numA++;
      } else if(present == 'b') {
          if(numB == b.length()) {
            ans = "B";
            break;
          }
          present = b.charAt(numB);
          numB++;
      } else {
          if(numC == c.length()) {
            ans = "C";
            break;
          }
          present = c.charAt(numC);
          numC++;
      }
    }
    System.out.println(ans);
  }
}