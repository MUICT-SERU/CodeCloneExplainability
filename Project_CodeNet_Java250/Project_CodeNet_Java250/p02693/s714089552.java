import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
  int k=sc.nextInt();
  System.out.println((k/n*n)>=m?"OK":"NG");
}
}