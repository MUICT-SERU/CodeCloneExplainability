import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n = Long.parseLong(scn.next());
		scn.close();

		double value = Math.sqrt(n);

		long i = (long) value;
		for (; i >= 1; i--) {
			if (n % i == 0) {
				System.out.println((long) (Math.log10(n / i) + 1));
				return;
			}
		}

	}
}
