import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = (N+"").length();
		for (long i = 1; i * i <= N; i++) {
			if (N % i == 0 && ((N/i)+"").length() < ans) {
				ans = ((N/i)+"").length();
			}
		}
		System.out.println(ans);
	}
}
