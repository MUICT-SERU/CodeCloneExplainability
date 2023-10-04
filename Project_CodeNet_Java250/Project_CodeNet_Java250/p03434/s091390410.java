

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int sumA = 0;

		Arrays.sort(a);

		for (int i = n - 1; i >= 0; i -= 2) {
			sumA += a[i];
		}

		System.out.println(2 * sumA - sum);
	}

}
