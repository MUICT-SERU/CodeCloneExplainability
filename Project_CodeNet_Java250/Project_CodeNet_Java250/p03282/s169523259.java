import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long K = sc.nextLong();
		if (K==1) {
			System.out.println(s.charAt(0));
			return;
		}
		for (int i=0;i<s.length()&&i<K;i++) {
			if (s.charAt(i)!='1') {
				System.out.println(s.charAt(i));
				return;
			}
		}
		System.out.println(1);
	}
}