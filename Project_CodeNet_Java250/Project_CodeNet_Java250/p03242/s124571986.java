import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = 0; i < 3; i++) {
			if (s.charAt(i) == '1') {
				System.out.print('9');
			} else {
				System.out.print('1');
			}
		}
	}
}