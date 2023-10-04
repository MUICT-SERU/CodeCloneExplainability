import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] ans = new int[n];
		for(int i = 0; i < m; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			ans[a-1]++;
			ans[b-1]++;
		}

		for(int i = 0; i < n; i++){
			System.out.println(ans[i]);
		}

	}

}