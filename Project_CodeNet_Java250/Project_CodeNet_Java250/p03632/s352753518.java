import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int ans = 0;
		for (int i = 0; i <= 100; i++) {
			if (A < i && B >= i && C < i && D >= i) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
