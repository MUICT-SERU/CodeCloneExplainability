import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next();
    if(s.indexOf("A")!=-1&&s.indexOf("B")!=-1){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}