import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int now = 1;
		for (int i = 0; true; i++) {
			if (now > N) {
				System.out.println(i);
				break;
			}
			now *= K;
		}
	}
}
