import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int n[] = new int [N];
    int cnt = 0;
    
    for(int i = 0; i<N; i++){
      n[i] = sc.nextInt();
      if(n[i] >= K){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}