import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "Good";
    if(s.charAt(0) == s.charAt(1)
        | s.charAt(1) == s.charAt(2)
        | s.charAt(2) == s.charAt(3)) {
      ans = "Bad";
    }
      System.out.println(ans);
  }
}