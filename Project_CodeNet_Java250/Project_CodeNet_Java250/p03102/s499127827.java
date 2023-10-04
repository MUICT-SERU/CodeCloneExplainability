import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			int total = c;
			for (int j = 0; j < m; j++) {
				total += sc.nextInt() * arr[j];
			}
			if (total > 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}