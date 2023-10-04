
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		long a[];
		a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
			if (a[i] == 0) {
				System.out.println(0);
				return;
			}
		}

		long result = 1;
		long limit = 1000000000000000000L;
		for (int i = 0; i < n; i++) {

			if (result <= limit / a[i]) {
				result = result * a[i];
			} else {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(result);

	}

}