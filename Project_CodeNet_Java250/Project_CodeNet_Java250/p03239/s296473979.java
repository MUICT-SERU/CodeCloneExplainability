
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		
		int ans = 2000;
		
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int t2 = sc.nextInt();
			if (t2 > t) continue;
			ans = Math.min(ans, c);
		}
		
		System.out.println((ans != 2000) ? ans : "TLE");
		
	}

}
