import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int x = sc.nextInt();

		for (; n != 0 || x != 0;) {
			int result = 0;
			for (int i = 1; i <= n - 2; i++) {
				for (int j = i + 1; j <= n - 1; j++) {
					for (int k = j + 1; k <= n; k++) {
						if (i + j + k == x) {
							result++;
						}
					}
				}
			}
			System.out.println(result);

			n = sc.nextInt();
			x = sc.nextInt();
		}

		sc.close();
	}
}