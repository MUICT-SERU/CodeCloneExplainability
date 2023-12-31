import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[9];
		for (int i = 0; i < n; i++) {
			int rate = sc.nextInt();
			int pos = Math.min(8, rate / 400);
			counts[pos]++;
		}

		int min = 0;
		for (int i = 0; i < counts.length - 1; i++) {
			if (counts[i] > 0) {
				min++;
			}
		}

		int max = min + counts[counts.length-1];
		if (n > 0 && min == 0) {
			min = 1;
		}
		System.out.println(min + " " + max);
	}
}