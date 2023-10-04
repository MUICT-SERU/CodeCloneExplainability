import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = kazoeru(N);
		for(long i = 1L;i * i <= N; i++) {
			if(N % i != 0) {
				continue;
			}
			long b = N / i;
			int s = Math.max(kazoeru(i), kazoeru(b));
			if(ans > s) {
				ans = s;
			}
		}
		System.out.println(ans);
	}
	public static int kazoeru(long i) {
		int ret = 1;
		while(i >=10) {
			i /= 10;
			ret++;
		}
		return ret;
	}
}
