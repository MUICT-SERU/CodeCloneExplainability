import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int[] a = new int[3];
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		sum = (a[1] - a[0]) + (a[2] - a[1]);
		
		System.out.println(sum);
		
		sc.close();
	}
}
