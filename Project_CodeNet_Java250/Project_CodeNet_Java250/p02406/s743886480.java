import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();

		call(n);

		sc.close();
	}

	private static void call(int n) {
		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			} else {
				while (x != 0) {
					if (x % 10 == 3) {
						System.out.print(" " + i);
						x = 0;
					}
					x /= 10;
				}					
			}
		}

		System.out.println("");
	}

}