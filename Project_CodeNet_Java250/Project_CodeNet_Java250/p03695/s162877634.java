import java.io.*;
import java.util.*;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] cnt = new int[13];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();

			cnt[a / 400]++;
		}

		int min = 0;
		for (int i = 0; i <= 7; i++) {
			if (cnt[i] > 0) {
				min++;
			}
		}

		int max = 0;
		for (int i = 8; i < 13; i++) {
			max += cnt[i];
		}

		pr.printf("%d %d\n", Math.max(1, min), min + max);
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);

		solve();

		pr.close();
		sc.close();
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}
