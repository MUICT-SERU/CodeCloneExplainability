import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3];
    int ans = 0;
    for(int i = 0;i < a.length;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    ans = a[0] + a[1];
    System.out.println(ans);
    sc.close();
  }
}