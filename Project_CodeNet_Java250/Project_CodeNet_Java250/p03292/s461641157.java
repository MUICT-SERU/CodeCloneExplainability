import java.util.*;
class Main
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println(Math.min(Math.abs(a-b) + Math.abs(a-c),
                       Math.min(Math.abs(a-b) + Math.abs(b-c),
             			        Math.abs(b-c) + Math.abs(a-c))));
  }
}