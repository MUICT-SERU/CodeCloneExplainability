import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      
      int a[] =new int[N+1];
      
      for(int i=1; i<=N; i++){
        int b =sc.nextInt();
        a[b] = i;
      }
      for(int i=1; i<=N; i++){
      System.out.print(a[i]+" ");
      }
    }
}
