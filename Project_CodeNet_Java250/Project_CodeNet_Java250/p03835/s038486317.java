import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int s = sc.nextInt();
		int count = 0;
		for (int a = 0; a <= k; a++) {
			for (int b = 0; b <= k; b++) {
				int c = s - a - b;
				if (0 <= c && c <= k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
