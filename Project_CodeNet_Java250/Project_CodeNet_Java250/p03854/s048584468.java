import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.next();
		int e = s.length();
		while(true) {
			if (e==0) {
				break;
			} else if (e<5) {
				System.out.println("NO");
				return;
			}

			if (s.substring(e-5, e).equals("erase")) {
				e -= 5;
			} else if (s.substring(e-5, e).equals("dream")) {
				e -= 5;
			} else if (s.substring(e-6, e).equals("eraser")) {
				e -= 6;
			} else if (s.substring(e-7, e).equals("dreamer")) {
				e -= 7;
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
