import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 1;
    int max = sc.nextInt();
    for(int i=1;i<N;i++){
      int H = sc.nextInt();
      max = Math.max(H,max);
      if(max==H){
        ans++;
      }
    }    
      System.out.println(ans);
  }
}