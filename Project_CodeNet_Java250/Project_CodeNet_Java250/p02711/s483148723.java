import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(("" + N).contains("7"))
      System.out.println("Yes");
    else System.out.println("No");
  }
}