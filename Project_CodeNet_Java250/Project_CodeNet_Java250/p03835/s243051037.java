import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int s = sc.nextInt();
		int sum = 0;

		for (int h = 0; h <= k; h++) {
			for (int i = 0; i <= k; i++) {
				if (h + i + k >= s && h + i <= s) {
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
	}
}