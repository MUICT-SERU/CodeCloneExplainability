import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		long ans = 100;
		for(long i=1; i*i<=N; i++) {
			if(N%i==0) {
				ans = Math.min(ans, getDigits(N/i));
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
	
	static int getDigits(long x) {
		int ans = 0;
		while(x>0) {
			x /= 10;
			ans++;
		}
		return ans;
	}
}
