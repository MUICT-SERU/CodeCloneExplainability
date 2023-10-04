import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int button[] = new int[N];
		int button_check[] = new int[N];
		for(int i = 0 ; i < N; i++) {
			button[i] = sc.nextInt();
			button_check[i] = 0;
		}
		
		int button_now = 0;
		int count = 0;
		int j = 0;
		int flag = 0;
		
		while(button_now != 2) {
			button_now = button[j];
			button_check[j] = 1;
			count++;
			
			j = button_now - 1;
			if(button_check[j] == 1) {
				System.out.println(-1);
				flag = 1;
				break;
			}
		}
		
		if(flag == 0) {
			System.out.println(count);
		}
	}
}