import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();sc.nextInt();sc.nextInt();sc.nextInt();
    System.out.println(sc.nextInt()-a>sc.nextInt()?":(":"Yay!");
  }
}