import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int k = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == '0') {
				k++;
			}else {
				k--;
			}
		}
		System.out.println(S.length() - Math.abs(k));
	}
}