import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			if(i<n) {
				System.out.printf("%d ", a[n - i]);
			} else {
				System.out.printf("%d", a[n - i]);
			}
		}
		System.out.println("");
	}

}

