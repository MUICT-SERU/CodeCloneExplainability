import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static final long sosu = 1000000007;
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			int[] buttons = new int[N+1];
			
			for(int i = 1; i<=N; i++){
				buttons[i] = scan.nextInt();
			}
			
			int ans = 0;
			int on = 1;
			while(ans < N){
				on = buttons[on];
				ans++;
				if(on == 2){
					System.out.println(ans);
					return;
				}
			}
			
			System.out.println(-1);
		}
	}
}
