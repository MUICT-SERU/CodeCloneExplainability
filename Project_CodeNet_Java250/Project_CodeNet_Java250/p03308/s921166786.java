import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
      int a = sc.nextInt();
      if(a>max){
        max = a;
      }
      if(a<min){
        min = a;
      }
    }

    int sub = max - min;
    System.out.println(sub);
  }
}