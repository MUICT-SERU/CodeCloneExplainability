import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;

		for (int j = 1; j < N + 1; j = j + 2) {
			int yakusu = 0;
			for (int i = 1; i < N + 1; i++) {
				if(j<i)break;
				if (j % i == 0) {
					yakusu++;
				}
			}
			if (yakusu == 8) {
				cnt++;
			}
		}

		System.out.println(cnt);

		sc.close();
	}

}