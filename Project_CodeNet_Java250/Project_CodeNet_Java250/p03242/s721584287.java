import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String n=sc.next();
    if(n.charAt(0)=='1') System.out.print(9);
    if(n.charAt(0)=='9') System.out.print(1);

    if(n.charAt(1)=='1') System.out.print(9);
    if(n.charAt(1)=='9') System.out.print(1);

    if(n.charAt(2)=='1') System.out.print(9);
    if(n.charAt(2)=='9') System.out.print(1);

    System.out.println();

  }
}
