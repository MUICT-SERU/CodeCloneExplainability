import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double debt = 100000;

		for(int i = 0; i < n; i++) {
			debt *= 1.05;
			// ?????????????????§????????´??????????????????
			if((long)debt % 1000 != 0) {
				debt /= 1000;
				debt = Math.ceil(debt);
				debt *= 1000;
			}
		}

		System.out.println((long)debt);
	}
}