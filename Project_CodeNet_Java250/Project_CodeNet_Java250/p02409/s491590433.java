import java.util.Scanner;
class Main {
	int[][][] t = new int [5][5][11];
	int n = 0, b = 0, f = 0, r = 0, v = 0, i = 0, k = 0;
	public void of() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
					t[b][f][r] += v;
		}
		for(n = 1; n <= 4; n++) {
			for(i = 1; i < 4; i++) {
				for(k = 1; k < 11; k++) {
							System.out.printf(" %d",t[n][i][k]);
				}
				System.out.println();
			}
			if(n < 4) {
				System.out.println("####################");
			}
		}
	}
	public static void main(String[] args) {
		new Main().of();
	}
}