import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			if (b <= c || d <= a) {
				System.out.println(0);
				return;
			}
			if (a <= c && d <= b) {
				System.out.println(d - c);
				return;
			}
			if (c <= a && b <= d) {
				System.out.println(b - a);
				return;
			}
			System.out.println(Math.min(b, d) - Math.max(a, c));
		}
	}
}
