import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int count = 0;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
      while(a[i]%2==0){
        a[i]/=2;
        count++;
      }
    }
    System.out.println(count);
  }
}
