import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next(),t=sc.next();
    s+=s;
    System.out.println(s.contains(t)?"Yes":"No");
      }
}