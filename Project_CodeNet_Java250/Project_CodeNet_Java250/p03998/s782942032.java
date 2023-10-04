import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		String S3 = sc.next();
		char turn = 'a';
		int a = S1.length();
		int b = S2.length();
		int c = S3.length();
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		while(true) {
			if(turn == 'a') {
				if(a == cnt1) {
					System.out.println("A");
					return;
				}
				cnt1++;
				turn = S1.charAt(cnt1 - 1);
			} else if(turn == 'b') {
				if(b == cnt2) {
					System.out.println("B");
					return;
				}
				cnt2++;
				turn = S2.charAt(cnt2 - 1);
			} else {
				if(c == cnt3) {
					System.out.println("C");
					return;
				}
				cnt3++;
				turn = S3.charAt(cnt3 - 1);
			}
		}
	}
}
