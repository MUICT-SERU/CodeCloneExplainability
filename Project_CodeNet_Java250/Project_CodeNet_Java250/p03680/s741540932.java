
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n + 1];
			for (int i = 0; i < n; i++) {
				arr[i + 1] = sc.nextInt();
			}

			int count = 0;
			int light = 1;
			int tmp;
			do {
				count++;
				tmp = arr[light];
				if (tmp == 0) {
					System.out.println("-1");
					return;
				}
				arr[light] = 0;
				light = tmp;
			} while (light != 2);
			System.out.println(count);
		}
	}
}
