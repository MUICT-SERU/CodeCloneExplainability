import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();
		int len1 = s1.length();
		int len2 = s2.length();
		int len3 = s3.length();

		int counta = 0;
		int countb = 0;
		int countc = 0;

		char temp = 'a';
		char ans;
		while (true) {
			if (temp == 'a') {
				if (len1 <= counta) {
					ans = 'A';
					break;
				}
				temp = s1.charAt(counta);
				counta++;
			} else if (temp == 'b') {
				if (len2 <= countb) {
					ans = 'B';
					break;
				}
				temp = s2.charAt(countb);
				countb++;
			} else if (temp == 'c') {
				if (len3 <= countc) {
					ans = 'C';
					break;
				}
				temp = s3.charAt(countc);
				countc++;
			}
		}
		System.out.println(ans);

	}
}