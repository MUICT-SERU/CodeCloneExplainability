import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    if(n >= str.length()){
      System.out.println(str);
    }
    else{
      String s = str.substring(0,n);
      s += "...";
      System.out.println(s);
    }
  }
}