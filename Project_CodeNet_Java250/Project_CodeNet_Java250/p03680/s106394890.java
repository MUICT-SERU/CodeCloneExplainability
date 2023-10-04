import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0; i < n; i++){
			a[i] = scanner.nextInt();
		}

		int val = a[0];
		int now = 0;
		int count = 1;
		while(true){
			if(val == 2){
				System.out.println(count);
				break;
			}
			now = val -1;
			val = a[val-1];
			a[now] = -1;
			count++;
			if(val == -1){
				System.out.println(-1);
				break;
			}
		}
	}
}
