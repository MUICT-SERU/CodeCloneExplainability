import java.util.Scanner;

class Main {
	public static void main(String[] $){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += sc.nextInt();
		}

		if (n < sum) {
			System.out.println("-1");
		} else {
			System.out.println(n - sum);
		}

		sc.close();
	}
}

