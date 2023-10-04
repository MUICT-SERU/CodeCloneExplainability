import java.util.*;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long n = sc.nextLong();
		long ret = Long.MAX_VALUE;
		for (int i = 1;i <= Math.sqrt(n);i++) {
			if (n%i==0) {
				int l1 = String.valueOf(i).length();
				int l2 = String.valueOf(n/i).length();
				ret = Math.min(ret, Math.max(l1, l2));
			}
		}
		System.out.println(ret);
	}
}