import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if((a==b)&&(a==c)&&(b==c)){
      System.out.println("No");
    }else if((a!=b)&&(a!=c)&&(b!=c)){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
  }