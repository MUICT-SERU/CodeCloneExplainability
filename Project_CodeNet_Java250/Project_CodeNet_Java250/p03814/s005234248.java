import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int n = c.length;
		int a, b;
		a = b = 0;
		for (int i = 0; i < n; i++) {
			if (c[i] == 'A') {
				a = i;
				break;
			}
		}
		for (int i = n - 1; 0 <= i; i--) {
			if (c[i] == 'Z') {
				b = i;
				break;
			}
		}
		System.out.println(b - a + 1);
	}
}
