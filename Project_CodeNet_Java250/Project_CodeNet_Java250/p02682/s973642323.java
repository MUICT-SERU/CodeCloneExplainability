import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
			int k = scanner.nextInt();
			int sum = Math.min(k, a);
			k -= Math.min(k, a);
			k -= Math.min(k, b);
			sum -= k;
			System.out.println(sum);
		}
	}
}
